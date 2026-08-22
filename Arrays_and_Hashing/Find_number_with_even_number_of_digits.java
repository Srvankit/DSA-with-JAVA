class Solution {
    public int findNumbers(int[] nums) {
        int count =0;
        int ans =0;
        for(int i=0; i<nums.length; i++){
            while(nums[i]>0){
                nums[i]=nums[i]/10;
                count++;
            }
            if(count%2 ==0){
                ans++;
            }
            count=0;
        }
        return ans;
    }
}

//LOGIC: 
// The code iterates through each number in the input array `nums`. 
// For each number, it counts the number of digits by repeatedly dividing the number by 10 until it becomes zero. 
// If the count of digits is even, it increments the answer counter `ans`. Finally, it returns the total count of numbers with an even number of digits.