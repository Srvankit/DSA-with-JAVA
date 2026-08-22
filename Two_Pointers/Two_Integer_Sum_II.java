

class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int left = 0;
        int right = numbers.length;
        int ans[]= new int[2];

        while (left<right) {
            int sum = numbers[left] + numbers[right];
            if (sum<target) {
                left++;
            }
            else if (sum>target) {
                right++;
            }
            else if (sum==target) {
               ans[0]=numbers[left];
               ans[1]=numbers[right];
            }
        }
        return ans;
    }
}

//LOGIC:
// The code implements a two-pointer approach to find two numbers in the sorted input array `numbers` that add up to the given `target`. 
// It initializes two pointers, `left` at the start of the array and `right` at the end of the array. In each iteration of the while loop, it calculates the sum of the numbers at the `left` and `right` pointers. 
// If the sum is less than the target, it increments the `left` pointer to increase the sum. If the sum is greater than the target, it decrements the `right` pointer to decrease the sum. If the sum equals the target, it stores the two numbers in the answer array `ans`. 
// The loop continues until a valid pair is found or until the pointers meet. Finally, it returns the answer array containing the two numbers that add up to the target.

