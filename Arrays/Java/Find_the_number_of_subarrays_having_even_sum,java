class Solution {
    long countEvenSum(int[] arr, int n) {
        // code here
        int even=0;
       int odd=0;
       int sum=0;
       int ans=0;
       for(int i=0;i<n;i++){
           sum+=arr[i];
           if(sum%2==0){
               ans+=1+even;
               even++;
           }
           else{
               ans+=odd;
               odd++;
           }
       }
       return ans;
    }
}
