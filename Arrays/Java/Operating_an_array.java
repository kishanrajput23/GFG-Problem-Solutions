class GfG {		
	public boolean searchEle(int a[],int x)
       {
		//add code here.
		for(int i=0; i<a.length; i++){
            if (a[i]==x) {
        return true;
            }
		}
    return false;
       }
	public boolean insertEle(int a[],int y,int yi)
        {
            //add code here.
            for (int i=0; i<100; i++) {
                if (i == yi) {
                    a[i] = y;
                    return true;
                }
            }
        return false;
	}
	public boolean deleteEle(int a[],int z)
        {
		//add code here.
		int index=0;
        boolean num=false;
        for(int i=0; i<100; i++) {
            if(a[i]==z) {
                index = i;
                num=true;
            }
        }
        if(num == true) {
            for(int i=99; i>index; i--) {
                a[i-1] = a[i];
            }
        }
        return true;
	}
}
