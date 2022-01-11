public class Palindrome{
boolean solution(String inputString) {
/**

Given the string, check if it is a palindrome.

Example

For inputString = "aabaa", the output should be
solution(inputString) = true;
For inputString = "abac", the output should be
solution(inputString) = false;
For inputString = "a", the output should be
solution(inputString) = true.
Input/Output

[execution time limit] 3 seconds (java)

[input] string inputString

A non-empty string consisting of lowercase characters.

Guaranteed constraints:
1 ≤ inputString.length ≤ 105.

[output] boolean

true if inputString is a palindrome, false otherwise.

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