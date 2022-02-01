public class BestTimeToBuyAndSellStock{
	 public int maxProfit(int[] prices) {
        /**
           [7|1|5|3|6|4]
            ^ 
                       ^
                       
          1-7 = max(-6,-inf) = -6
          5-1 = max(4,-6) = 4
          O(n^2)-time
          O(1) - space
          1. intutive
             - nested loop
             - max(arr[j]-arr[i],overallMax) 
             - 0 if -inf else overallMax
         O(n) - time
         O(1) - space
          [7|1|5|3|6|4]
                      
          min = {1,1} --[idx,arr[idx]]
         2. time optimised
           - get the min
           - loop from idx to arr.len till u get max profit
            
        */
        
        int min =Integer.MAX_VALUE;
        int maxProfit=0;
        for(int i=0;i<prices.length;i++){
            if(prices[i] < min){
               min=prices[i];
            }
              maxProfit = Math.max(maxProfit,prices[i]-min);
        }
        
       
        return maxProfit;
    }
}