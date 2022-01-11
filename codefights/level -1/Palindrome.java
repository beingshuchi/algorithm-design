public class Palindrome{
boolean solution(String inputString) {
/**
1. null = false
2. len == 1 true
aabaa
 ^^
#1. intutive
 - reverse string - n|n space
 - compare input and revese 1|1
 total time - n
 total space - n
 
#2 optimised 1
 - pointer left and right
 - iterate till left <= right and return false if left char != right char -- n | 1 space
 - else return true
 total time n
 total time 1
*/

if(inputString == null)return false;
if("".equals(inputString)  || inputString.length()==1) return true;

int left = 0;
int right = inputString.length()-1;

while(left <= right){
    if(inputString.charAt(left)!=inputString.charAt(right))return false;
    left++;
    right--;
}

return true;
}

}