import java.util.*;
class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
     HashMap<String,List<String>> map = new HashMap<>();
     for(String str : strs){
        char[] ch = str.toCharArray();
        Arrays.sort(ch);
        String key = new String(ch);
        map.putIfAbsent(key,new ArrayList<>());
        map.get(key).add(str);
     }
     return new ArrayList<>(map.values());
    }
}

//LOGIC:
// The code uses a HashMap to group anagrams from the input array of strings `strs`. 
// It iterates through each string in the array, sorts the characters of the string to create a key, and uses this key to group the anagrams together in the HashMap. 
// The sorted string serves as a unique identifier for each group of anagrams. If the key does not exist in the HashMap, it initializes a new list for that key. It then adds the original string to the corresponding list in the HashMap. 
// Finally, it returns a list of all the grouped anagrams by converting the values of the HashMap into a new ArrayList.