import java.util.HashMap;

class Solution {
    public boolean isAnagram(String s, String t) {
        HashMap<Character,Integer> map = new HashMap<>();
        for(int i=0; i<s.length(); i++){
            char ch = s.charAt(i);
            map.put(ch,map.getOrDefault(ch,0)+1);
        }
        for(int i=0; i<t.length(); i++){
            char ch = t.charAt(i);
            map.put(ch,map.getOrDefault(ch,0)-1);
        }
        for(int count : map.values()){
            if(count != 0)
                return false;
        }
        return true;
    }
}


//LOGIC:
// The code uses a HashMap to count the occurrences of each character in the first string `s`. 
// It iterates through the characters of `s`, updating the count for each character in the HashMap. 
// Then, it iterates through the characters of the second string `t`, decrementing the count for each character in the HashMap. 
// Finally, it checks if all counts in the HashMap are zero. 
// If they are, it means that `s` and `t` are anagrams of each other, and the method returns true; otherwise, it returns false.