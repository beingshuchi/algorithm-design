class ThirdLargest
{
    
    /**
    NOTE:
      - arr = null return -1
      - n <= 2 return -1
     #1. intutive approach:
        - sort the array
        - return a[n-3]
        time: n lg n
        space: 1
     #2 optimised 1
       - take three variavles to store first, sec and third largest nums by
         initialising to -1
       - iterate through the loop 
           - if find max then update sec and thid max and store max
           - otherwise if we find sec max then update third max and store sec max
           - other wise if we find third max just update third max
        time: n
        space: 1
    
    
    
    */
    
    int thirdLargest(int a[], int n)
    {
        if(a == null)return -1;
	    if(n <= 2)return -1;
	    int firstMax = -1;
	    int secMax = -1;
	    int thirdMax = -1;
	    for(int i =0; i<n ;i++){
	        if(a[i] > firstMax){
	            int tmp = secMax;
	            secMax = firstMax;
	            thirdMax = tmp;
	            firstMax = a[i];
	        }else if(a[i] > secMax){
	            thirdMax = secMax;
	            secMax = a[i];
	        }else if(a[i] > thirdMax){
	            thirdMax = a[i];
	        }
	    }
	    return thirdMax;
    }
}
