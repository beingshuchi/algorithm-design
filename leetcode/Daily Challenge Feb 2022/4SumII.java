public class 4SumII{
	 public int fourSumCount(int[] A, int[] B, int[] C, int[] D) {
        /**
        1, 2
       -2,-1
       -1, 2
        0, 2
        
        {1,-2,-1,0} count = 0
        {1,-2,-1,2} count = 1
        {1,-2,2,0} count = 1
        {1,-2,2,2} count = 1
        {1,-1,-1,0} counnt =1
        {1,-1,-1,2} count =1
        {1,-1,2,0} count =1
        ........        
        {2,-1,-1,0} count =2
        ......
        time : O(n^4)
        space: O(1)
        
        [1,2]
        [-2,-1]
        [-1,2]
        [0,2]
        
        {
        -1 -> 1
        0 -> 2
        1 ->1
        }
        count = 1  -(-1+0)=(1) in map
        count = 2  -(-1+2)=-(1)=-1
        count = 2  -(2+0) = -(2)=-2
        count = 3  -(2+2) = -4
        */
        
       Map<Integer, Integer> sums = new HashMap<>();
        int result = 0;
        for(int i : A){
            for(int j : B){
                int sum = i + j;
                sums.put(sum, sums.getOrDefault(sum, 0) + 1);
            }
        }
        
        for(int i : C){
            for(int j : D){
              
                result += sums.getOrDefault(-(i+j), 0);
            }
        }
        return result;
    }
    
    
}