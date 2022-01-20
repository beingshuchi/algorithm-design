public class MaxAndSecondMax{
	
	public static ArrayList<Integer> largestAndSecondLargest(int sizeOfArray, int arr[])
    {
        //code here.
        /**
         * 2 1 2
         *   ^
         * max:2
         * max_sec:1
         * time: O(n)
         * space: O(1)
        */
        int max = Integer.MIN_VALUE;
        int sec_max = Integer.MIN_VALUE;
        for(int a: arr){
            if(max < a){
                sec_max = max;
                max=a;
            }else if(max > a && sec_max < a){
                sec_max = a;
            }
        }
        
        ArrayList<Integer> list = new ArrayList<>();
        if(max == Integer.MIN_VALUE){
            list.add(-1);
        }else{
            list.add(max);
        }
        
        if(sec_max == Integer.MIN_VALUE){
            list.add(-1);
        }else{
            list.add(sec_max);
        }
        return list;
    }
}