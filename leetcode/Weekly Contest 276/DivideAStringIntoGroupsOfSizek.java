pulic class DivideAStringIntoGroupsOfSizek{
	/**
s = "abcdefghi", k = 3, fill = "x"
[abc,deff,ghi]
s="aabasad" k =2 fill ="x"
[aa,ba,sa,dx]
s="eiwiewiiwoowooeowoo" k =8 fill = "n"
[eiwiewii,woowooeo,woonnnnn]
	*/
	 public String[] divideString(String s, int k, char fill) {
        
     
        List<String> list = new ArrayList<>();
        for(int i=0;i<s.length();i+=k){
            String sub;
            if((i+k)<s.length()){
             sub = s.substring(i,i+k);
             list.add(sub);
        }else{
            sub = s.substring(i);
            StringBuilder sb= new StringBuilder(sub);
          
            if(sub.length() < k){
                int remaining = k-sub.length();
               while(remaining>0){
                    sb.append(fill);
                   remaining--;
                }
            }
            
           
            list.add(sb.toString());
            }
        }
        return list.toArray(new String[list.size()]);
    }
}