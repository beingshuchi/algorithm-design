public class CommonCharacterCount{
public int commonCharacterCount(String s1, String s2){
	/**
aabbcc
 ^
adcaa
  ^
a-1
d-1
c-0
  count =3
  1- intutive:
     - find smaller string and larger string
     - get frequence for smaller string
     - iterate through larger string
       - if freq of ch >0 increase count
    time: m + n (m-larger string and m-smaller string)
    space: n(n-smaller string length)
  2- optimised 1:
     - 
*/
//if(s1.length() == s2.length())return s1.length();
  Map<Character, Integer> freq = new HashMap<>();
  String smaller,larger;
  if(s1.length()<=s2.length()){
      smaller=s1;
      larger=s2;
  }else{
      smaller=s2;
      larger=s1;
  }
  for(char ch : smaller.toCharArray()){
      freq.putIfAbsent(ch, 0);
      freq.put(ch, freq.get(ch)+1);
  }
  int count =0;
  for(char ch : larger.toCharArray()){
      if(freq.containsKey(ch) && freq.get(ch)>0){
          freq.put(ch, freq.get(ch)-1);
          count++;
      }
  }
  return count;
}
}