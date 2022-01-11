public class FirstDuplicates{

int solution(int[] a) {
/**

Given an array a that contains only numbers in the range from 1 to a.length, find the first duplicate number for which the second occurrence has the minimal index. In other words, if there are more than 1 duplicated numbers, return the number for which the second occurrence has a smaller index than the second occurrence of the other number does. If there are no such elements, return -1.

Example

For a = [2, 1, 3, 5, 3, 2], the output should be solution(a) = 3.

There are 2 duplicates: numbers 2 and 3. The second occurrence of 3 has a smaller index than the second occurrence of 2 does, so the answer is 3.

For a = [2, 2], the output should be solution(a) = 2;

For a = [2, 4, 3, 5, 1], the output should be solution(a) = -1.

Input/Output

[execution time limit] 3 seconds (java)

[input] array.integer a

Guaranteed constraints:
1 ≤ a.length ≤ 105,
1 ≤ a[i] ≤ a.length.

[output] integer

The element in a that occurs in the array more than once and has the minimal index for its second occurrence. If there are no such elements, return -1.


NOTE:
 1. range - 1 to n
 2. 1st num duplicate minimal index
 3. no duplicates means return -1
 
 Input:
 1. no negs
 2. len of arr == 0 || arr == null || arr.len ==1 return -1
 
 #1 intutive
  [2, 1, 3, 5, 3, 2]
                  ^
  {
    2 -> [0,5],  < min=5
    1 -> [1], < min=5
    3 -> [2 , 4],< min=4
    5 -> [3]< min =4
  }
return min

[2, 1, 3, 5, 7, 9]
                  ^
  {
    2 -> [0],  < min= inf
    1 -> [1], < min=inf
    3 -> [2 ],< min=inf
    5 -> [3]< min =inf
    7 -> [4] < min=inf
    9 ->  [5] < min=inf
  }
  
  return -1 if min == inf\

time - n
space - n

  #2 optimised-1
  [2, -1, -3, -5, 3, 2]
   0  1  2  3  4  5 
             ^
             return 5 if arr[3]<0
        return -1 if array iteration is complete
        

time -n
space -1
*/
if(a ==null || a.length == 0|| a.length == 1)return -1;

for(int i = 0; i < a.length; i++){
    int pos = Math.abs(a[i]);
    if( a[pos - 1] < 0) return Math.abs(a[i]);
    a[pos - 1] = a[pos - 1] * -1;
}
return -1;

}


}