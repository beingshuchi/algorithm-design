public class IsLucky{
	
	boolean isLucky(int n) {
    /**
    1230
    1+2=3
    3+0=3
    3==3
    1230/10 = 123 | 1 |[0]
    123/10 =12 | 2|[0|3]
    12/10 =1 | 3| [0|3|2]
    1/10 =10|4|[0|3|2|1]
    total digits = 4
    if total digits % 2 != 0 then return false i.e. odd means unlucky
    total sum first half == total sum second half
    time: M (total digits)
    space: M (total digits)
    
    */
    
    
    int num = n;
    int digit=0;
    List<Integer> digits = new ArrayList<>();
    while(num>0){
        digit++;
        digits.add(num%10);
        num = num / 10;
    }
    
    if(digit%2 != 0)return false;
    int firstSum =0;
    int secSum =0;
    for(int i=0;i<digit/2;i++){
        firstSum += digits.get(i);
    }
    for(int i=digit/2;i<digit;i++){
        secSum += digits.get(i);
    }
    return firstSum ==  secSum;
}

}