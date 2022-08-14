class GfG {
	boolean isBinary(String str) {
	  //Your code here
	  for (char x : str.toCharArray()) {
	      if (x!='1' &&  x!='0') {
	          return false;
	      }
	  }
	  return true;
	}
}
