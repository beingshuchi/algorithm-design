class MinimumMovesToReachTargetScore {
/**
                19|3|7
			   /  
			  18|3|6
			    \
                 9|2|5
                  /
                 8|2|4
        		/
               4|1|3
                /
               3|2|2
			   /
			   2|0|1
			   /
			   1|0|0
 #1. intutive - use recursion
     - base case - if target ==1 return 0
	 - if maxDoubles>0 and even number count by diving by two target +1
	 - else decrement by 1 get count +1
	 
#2. use memoisation
#3. use dp table
#4. spce efficent:
    - keep track of count
	- loop until max Double is not 0 or target not 1
	- return target - 1 - count;
*/
    Map<Integer,Integer> cache = new HashMap<>();
    public int minMoves(int target, int maxDoubles) {
   
        if(target == 1)return 0;
       int count =0;
       while(maxDoubles > 0 && target>1){
            if(maxDoubles > 0 && target%2 == 0){
                target = target >>1;
                maxDoubles--;
            }
            else target--;
            count++;
        }
        return target - 1 + count;
        
    }
 
}