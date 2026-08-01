class Solve {
    int[] getMoreAndLess(int[] arr, int n, int x) {
        // code here
        int count1 = 0, count2 = 0;
        
        for(int i: arr){
            if(x >= i) count1++;
            if(x <= i) count2++;
        }
        
        return  new int [] {count1, count2};
    }
}
