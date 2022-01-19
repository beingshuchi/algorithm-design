public class FirstNotRepeatingCharacter{
	/**
	  1. intutive approach:
	    - iterate through string input and calculate freq
		- return the first character that has the freq == 1
		- if we do not find any char return '_'
		time: O(n)
		space: O(1)
	 
	*/
  char firstNotRepeatingCharacter(String s){
	  
	    int[] freq = new int[26];
    for(char ch : s.toCharArray()){
        freq[ch-'a']++;
    }
    for(char ch : s.toCharArray()){
        if(freq[ch-'a']==1)return ch;
    }
    return '_';
  }
}