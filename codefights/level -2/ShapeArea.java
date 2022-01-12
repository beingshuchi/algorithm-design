public class ShapeArea{
int calculate(int n) {
/**
 n==1 return 1
 n =2
   2*2 +1*1
 n=3
 3*3+2*2+1
 
 time : 1
 space : 1
*/

if(n == 1)return 1;
return (n*n)+ ((n-1)*(n-1));
}

}