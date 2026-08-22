import java.util.HashMap;

class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i=0; i<nums.length; i++){
            int complement = target - nums[i];
            if(map.containsKey(complement)){
                return new int[]{map.get(complement), i};
            }
            map.put(nums[i], i);
        }
        return new int[]{}; // This line will never be reached if the input is guaranteed to have a solution
    }
}

//LOGIC:
// The code uses a HashMap to store the numbers from the input array `nums` along with their corresponding indices. 
// It iterates through the array, calculating the complement of each number (i.e., `target - nums[i]`). 
// If the complement is already present in the HashMap, it means that a pair of numbers that add up to the target has been found, and their indices are returned. 
// If not, the current number and its index are added to the HashMap for future reference. 
// The method assumes that there is always a valid solution in the input.