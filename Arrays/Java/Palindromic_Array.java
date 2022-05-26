class GfG
{
	public static int palinArray(int[] a, int n) {
	    String r = "";
        String rev = "";
        int u = 0;
        for(int i=0; i<a.length; i++){
            r = String.valueOf(a[i]);
            for(int j=0; j<r.length(); j++){
                char b = r.charAt(j);
                rev = b+rev;
            }
            if(rev.equals(r)){
                u++;
            }
            rev="";
        }
        if(u==a.length){
            return 1;
        }
        else {
            return 0;
        }
	}
}
