class Compute {
    public String isSubset( long a1[], long a2[], long n, long m) {
        HashSet<Long> arr1 = new HashSet<>();
        HashSet<Long> arr2 = new HashSet<>();

        for(int i=0;i<n;i++)
            arr1.add(a1[i]);

        for(int i=0;i<m;i++)
            arr2.add(a2[i]);

        if(!arr1.containsAll(arr2)){
            return "No";
        }
            return "Yes";
        
    }
}
