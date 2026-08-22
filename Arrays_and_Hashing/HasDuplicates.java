import java.util.*;
class Solution {
    public boolean hasDuplicate(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        for(int x : nums){
            if(!set.add(x))
                return true;
        }
        return false;
    }
}

//LOGIC:
// The code uses a HashSet to track the unique elements in the input array `nums`.
// It iterates through each element in the array and attempts to add it to the HashSet.
// If the element is already present in the HashSet (i.e., the add operation returns false), it indicates that a duplicate has been found, and the method returns true.
// If the loop completes without finding any duplicates, the method returns false, indicating that all elements in the array are unique.