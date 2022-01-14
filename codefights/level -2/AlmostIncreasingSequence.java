public class AlmostIncreasingSequence{
	boolean solution(int[] sequence) {
/**
NOTE: - if len(arr) == 2 then arr[0]<arr[1]
      -  strictly increasing
      - not more than 1 can be removed
      - is it a sorted arr?
      #1. Intutive approach:
          [1,3,2]
               ^
           count = 1
          [1,2,4,3,2]
             ^ ^ ^ ^
             count = 1
             count = 2
             return count == 0 || count == 1
             [1, 4, 10, 4, 2]
              ^         ^
              renoved = 0 
         time : n
         space : 1
		 
		 - iterate from and check diff --> arr[i+1] - arr[i] 
		      if this diff is less than 0 then  comapre arr[i +2] - arr[i] and arr[i+1] - arr[i-1] 
			   only if i-1>=0 and i+2<=n-1
*/

  int removed = 0;
 
   for(int idx = 0; idx < sequence.length - 1; idx++){
     if(sequence[idx+1] - sequence[idx] <= 0){
         removed++;
         if((idx - 1) >= 0 && (idx + 2) <= sequence.length - 1){
             if((sequence[idx + 2] -  sequence[idx]) <= 0 && (sequence[idx + 1] - sequence[idx - 1]) <= 0){
                 return false;
             }
         }
     }
      
  }
  
  return removed <= 1;
}

}