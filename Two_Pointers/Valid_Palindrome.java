class Solution {
    public boolean isPalindrome(String s) {
        int left =0;
        int right = s.length()-1;

        while(left<right){
            while(left<right && !Character.isLetterOrDigit(s.charAt(left))){
                left++;
            }
            while(left<right && !Character.isLetterOrDigit(s.charAt(right))){
                right--;
            }
            if (Character.toLowerCase(s.charAt(left)) !=
                Character.toLowerCase(s.charAt(right))) {
                return false;
            }
            left++;
            right--;
            
        }
        return true;
    }
}

//LOGIC:
// The code implements a two-pointer approach to check if the input string `s` is a palindrome, considering only alphanumeric characters and ignoring cases. 
// It initializes two pointers, `left` at the start of the string and `right` at the end of the string. In each iteration of the while loop, it skips non-alphanumeric characters by moving the pointers inward until they point to valid characters. 
// It then compares the characters at the `left` and `right` pointers, converting them to lowercase for case-insensitive comparison. If the characters do not match, it returns false, indicating that the string is not a palindrome. 
// If all corresponding characters match, it returns true, indicating that the string is a palindrome.