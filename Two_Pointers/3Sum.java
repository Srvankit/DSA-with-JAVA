
import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<Integer> ls = new ArrayList<>();
        List<List<Integer>> lst = new ArrayList<>();

        int left=0;
        int right = nums.length -1;

        for(int i=1; i<nums.length-1; i++)
            while (left<right) {
                int sum = Math.abs(nums[i]+nums[left]+nums[right]);
                if (sum<0) {
                left++;
            }
            else if(sum>0){
                right--;
            }
            else if (sum==0) {
                ls.add(nums[i]);
                ls.add(nums[left]);
                ls.add(nums[right]);
                lst.add(ls);
            }
            }
        return lst;
    }
}

//LOGIC:
// The code implements a solution to the 3Sum problem, which finds all unique tripletS in the input array `nums` that sum up to zero. 
// It uses a two-pointer approach along with a for loop to iterate through the array. For each element in the array, it sets two pointers, `left` and `right`, to find pairs of numbers that, when added to the current element, equal zero. 
// The code checks the sum of the three numbers and adjusts the pointers accordingly: if the sum is less than zero, it increments the `left` pointer; if the sum is greater than zero, it decrements the `right` pointer; if the sum equals zero, it adds the triplet to the result list. 
// The process continues until all unique triplets are found.       