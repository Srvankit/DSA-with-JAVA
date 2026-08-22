class Solution {
    public int[] sortedSquares(int[] nums) {
        int arr[] = new int[nums.length];
        for(int i=0; i<nums.length; i++){
            arr[i] = nums[i]*nums[i];
        }
        int min = arr[0];
        for(int i=0; i<arr.length; i++){
            for(int j=i+1; j<arr.length; j++){
                if(arr[i]>arr[j]){
                    min = arr[j];
                    arr[j] = arr[i];
                    arr[i] = min;
                }
            }
        }
        return arr;
    }
}

//LOGIC:
// The code first creates a new array `arr` to store the squares of each element in the input array `nums`.
// It then iterates through the `nums` array, squaring each element and storing it in the corresponding index of the `arr` array.
// After that, it uses a nested loop to sort the `arr` array in ascending order using a simple selection sort algorithm.
