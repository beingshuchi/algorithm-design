public class MakeArrayConsecutive2{
int solution(int[] statues) {
/**
[6,2,3,8]
[2,3,6,8]
       ^
#1. intutive
 if(arr[i-1]-arr[i+1]>1)
 count = count + arr[i-1] - arr[i] - 1 
 count = 0 + 6 - 3 -1 = 2
 count = 2 + 8 - 6 -1 = 2 + 1 = 3
 
 8-2+1= 7
 7 - 4 = 3 
 time: n lg n
 space: n
 
 #2. optimised
  - find min
  - find max
  - max - min + 1 - n
 time: n
 space: 1
*/
int min = Integer.MAX_VALUE;
int max = Integer.MIN_VALUE;
for(int i = 0; i<statues.length; i++){
    min = Math.min(statues[i],min);
    max = Math.max(statues[i],max);
}
return max - min + 1 - statues.length;
}

}