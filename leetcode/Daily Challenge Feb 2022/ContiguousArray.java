public class  ContiguousArray{
	 public int findMaxLength(int[] nums) {
        /**
          [0,1,1,1,1,0,0,0]
                         ^ 
           zeros=1|2|3|4
           ones=0|1|2|3|4
           i=0
           j=1|2|3|4|5|6|7
           maxLen =0|7-0+1=8|
           -unnessarily we are calculating for each elem
           O(n^2)
           O(1)
          
              
          1. Intutive:
              - for each pointer scan the remaining array 
              - if encountered 0 then zeros++
              - else ones++
              maxLen =max(maxLen, j - i +1)
        2. Optimised:
          -use a hashmap that stores the sum and corresponding index
          - maxLen =max(maxLen, i-j)
          
          initilising sum 0 as -1 to handle the edgecase
           [0,1,1,1,1,0,0,0]
                ^
          sum =0|-1|0|1|
          maxLen =0|0|1
          
          {0=-1, -1=0, 1=2, 2=3, 3=4}

          
        */
        HashMap<Integer,Integer> hash = new HashMap<>();
        hash.put(0,-1);
        int maxLen =0;
        int count=0;
    
    for(int i=0; i<nums.length; i++){
         if(nums[i]==0){
             count--;
         }else{
             count++;
         }
        
        if(!hash.containsKey(count)){
            hash.put(count, i);
        }else{
            maxLen = Math.max(maxLen, i-(hash.get(count)));
        }
    }
        return maxLen;
    }
}