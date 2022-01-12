class ReplaceAllZerosWithFive {
    
    /*you are required to complete this method*/

/**
 * Notes:
 *  - if n ==0 return 5;
 * #1. intutive approach --
 *     - convert int to string
 *     - iterate through each char and append 5 instead of 0 other wise char
 *       in the string
 *     - convert back to int
 *    time: K
 *    space: 2*K
 * #2. optimised approach
 *     1002
 *     100
 *     10 -> 50
 *     1 -> 550
 *     0 -> 0550
 *    1002+550
 *   tens = 1
 *   fives = 0
 *   iterate till n > 0 [1002 | 100]
 *     - check if n%10 ==0  then five = five + (5 * tens) 
 *     - n=n/10
 *     - tens = tens * 10
 *   add fives + num
 * 
 * time: K
 * space 1
*/
    
    int convertfive(int num) {
        // Your code here
    if(num == 0)return 5;
    int n = num;
    int tens = 1;
    int res = 0;
    while(n > 0){
        if(n % 10 == 0){
            res += (5 * tens);
        }
        
        n = n / 10;
        tens = tens * 10;
    }
    
    return res+num;
    }
    
    
}