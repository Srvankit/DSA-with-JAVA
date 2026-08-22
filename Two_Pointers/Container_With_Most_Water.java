class Solution {
    public int maxArea(int[] height) {
        int left =0;
        int right = height.length-1;
        int maxar = 0;

        while(left != right){
            int area = (right - left)*Math.min(height[left], height[right]);
            maxar = Math.max(maxar, area);
            if(height[left]<height[right]){
                left++;
            }
            else{
                right--;
            }
        }
        return maxar;
    }
}

//LOGIC:
// The code uses a two-pointer approach to find the maximum area of water that can be contained between two lines represented by the heights in the input array `height`.
// It initializes two pointers, `left` at the start of the array and `right` at the end of the array, and a variable `maxar` to keep track of the maximum area found so far.
// In each iteration of the while loop, it calculates the area formed by the lines at the `left` and `right` pointers, updates `maxar` if the calculated area is greater than the current `maxar`, and then moves the pointer corresponding to the shorter line inward (either incrementing `left` or decrementing `right`) to potentially find a larger area. The loop continues until the two pointers meet, at which point the maximum area found is returned.      
