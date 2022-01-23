public class ReverseInParentheses{
 String solution(String inputString) {
/**
  (bar) =>(rab)
  set start =-1
  set end =-1
  if we find ( set start = i
  if we find ) 
    - set end = i
    - get the revered string  from start to end
    - recusrse from (0 to strt)+revrse+(end+1)
    - return input string
    
 time: O(n)
 space: O(n)
*/

int start = -1;
    int end = -1 ;
    for(int i = 0; i < inputString.length(); i++){
        if(inputString.charAt(i) == '('){
            start = i;
        }
        if(inputString.charAt(i) == ')'){
            end = i;
            String reverse = new StringBuilder(inputString.substring(start+1, end)).reverse().toString();
           return solution(inputString.substring(0, start) + reverse+ inputString.substring(end+1));
        }
    }
    return inputString;
}

}