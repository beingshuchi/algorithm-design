public class AdjacentElementsProduct{

int solution(int[] inputArray) {
/**
Given an array of integers, find the pair of adjacent elements that has the largest product and return that product.

Example

For inputArray = [3, 6, -2, -5, 7, 3], the output should be
solution(inputArray) = 21.

7 and 3 produce the largest product.

Input/Output

[execution time limit] 3 seconds (java)

[input] array.integer inputArray

An array of integers containing at least two elements.

Guaranteed constraints:
2 ≤ inputArray.length ≤ 10,
-1000 ≤ inputArray[i] ≤ 1000.

[output] integer

The largest product of adjacent elements.

 [3, 6, -2, -5, 7, 3]
                   ^  ^
     18, -12 10 -35 21
#1. intutive
 - keep a track of all product in an array 
 - find max in that array
 time - n
 space - n
 
 #2 optimised 1
  - keep track only max so far by iteratin
  time - n
  space - 1
*/

int maxSoFar = Integer.MIN_VALUE;
for(int i = 0; i < inputArray.length - 1; i++ ){
    int currentProduct = inputArray[i] * inputArray[i + 1];
    maxSoFar = Math.max(maxSoFar,currentProduct);
}
return maxSoFar;
}


}