class GfG{
	public Stack<Integer> sort(Stack<Integer> s)
	{
		//add code here.
		if (!s.isEmpty()) {
		    int temp=s.pop();
		    sort(s);
		    sorted(s,temp);
		}
		return s;
	}
	void sorted(Stack<Integer> s,int temp) {
	    if(s.size()>0){  
	        int x=s.pop();
	        if(x>temp) {
	            sorted(s,temp);
	            s.add(x);
	        }
	        else {
	            s.add(x);
	            s.add(temp);
	        }
	   }
	   else {
	       s.add(temp);
	   }
	}
}
