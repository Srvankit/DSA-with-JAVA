class Solution {
    public void duplicateZeros(int[] arr) {
        int n = arr.length;
        for(int i=0; i<n; i++){
            if(arr[i]==0){
                for(int j=n-1; j>i; j--){
                    arr[j] = arr[j-1];
                }
                if(i+1<n){
                    arr[i+1] = 0;
                }
                i++;
            }
        }
    }
}

//LOGIC:
// The code iterates through each element in the input array `arr`.
// When it encounters a 0, it shifts all subsequent elements to the right by one position.
// It then places another 0 in the next position and increments the index to skip the newly placed 0.   