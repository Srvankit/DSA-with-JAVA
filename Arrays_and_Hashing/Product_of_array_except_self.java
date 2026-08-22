class Solution {
    public int[] productExceptSelf(int[] nums) {
       int[] res = new int[nums.length];
res[0] = 1;
for (int i = 1; i < nums.length; i++) {
    res[i] = res[i - 1] * nums[i - 1];
}
int rightProduct = 1;
for (int i = nums.length - 1; i >= 0; i--) {
    res[i] *= rightProduct;
    rightProduct *= nums[i];
}
return res;
    }
}  

//LOGIC:
// The code calculates the product of all elements in the input array `nums` except for the element at the current index, without using division. 
// It does this in two passes. In the first pass, it computes the product of all elements to the left of each index and stores it in the `res` array. 
// In the second pass, it computes the product of all elements to the right of each index using a variable `rightProduct`, and multiplies it with the corresponding value in `res`. 
// Finally, it returns the `res` array containing the desired products.