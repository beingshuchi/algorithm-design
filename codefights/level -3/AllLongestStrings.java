public class AllLongestStrings{
	/**
	  1.intutive approach
	    - get the max length
		- iterate and add in the list all the string that have string length equal to max length
		
		time: O(n)
		space: O(n)
	*/
public String[] all_longest-strings(String []inputArray ){
	int maxLen =Integer.MIN_VALUE;
for(String str: inputArray){
    maxLen =Math.max(maxLen,str.length());
}

List<String> list = new ArrayList<>();
for(String str : inputArray){
    if(maxLen == str.length()){
        list.add(str);
    }
}
return list.toArray(new String[list.size()]);
}
}