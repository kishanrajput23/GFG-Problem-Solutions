class Solution {
    int findKRotation(int arr[], int n) {
        // code here
        int k=1;
	    for(int i=0; i<n-1; i++){
	        if (arr[i] > arr[i+1]) {
	            break;
	        }
	        else {
	            k++;
	        }
	    }
	    return k%n;
    }
}
