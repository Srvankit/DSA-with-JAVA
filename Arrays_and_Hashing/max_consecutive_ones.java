class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int count =0 ;
       int max =0;
        for(int i=0; i<nums.length; i++){
            if(nums[i]==1){
                count ++;
                max=Math.max(count,max);
            }
            else{
                count =0;
            }
        }
        return max;
    }
}

//LOGIC:
// The code iterates through each element in the input array `nums`.
// It maintains a `count` variable to keep track of the current streak of consecutive 1s.
// Whenever it encounters a 1, it increments the `count` and updates the `max` variable if the current `count` exceeds the previous `max`.
// If it encounters a 0, it resets the `count` to 0, as the streak of consecutive 1s has been broken.
