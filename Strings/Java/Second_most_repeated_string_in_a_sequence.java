String secFrequent(String arr[], int N)
   {
       HashMap<String, Integer> map = new HashMap<>();
       for(String str:arr){
           if(!map.containsKey(str)){
               map.put(str,1);
           }else{
               map.put(str, map.get(str)+1);
           }
       }
       int max_f=0,max_s=0;
       String ans="";
       //finding first max
       for(Map.Entry<String, Integer> entry:map.entrySet()){
               
               max_f = Math.max(max_f,entry.getValue());
               
           }
       //finding second max
       for(Map.Entry<String, Integer> entry:map.entrySet()){
           if(entry.getValue()<max_f && entry.getValue()>max_s){
               max_s = entry.getValue();
               ans=entry.getKey();
           }
       }
       return ans;
   }
