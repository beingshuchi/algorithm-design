public class SortByHeight{
	/**
[-1, 150, 180, 170, -1, -1, 160, 190]
           ^                 ^
[-1, 150]

1. intutive
  - use nested loops
  - if a[i]==-1 continue
  tim: O(n^2)
  space: O(1)
2. optimised time
   - add only those elems  that are not -1
   - sort this list
   - add in original array
   tim: n lg n
   space: n
*/
int[] solution(int[] a) {
   /*for(int i=0;i<a.length;i++){
       if(a[i]==-1)continue;
       for(int j=0;j<a.length;j++){
           if(i==j || a[j]==-1 || a[j]<=a[i])continue;
           int tmp = a[j];
           a[j]=a[i];
           a[i]=tmp;
       }
   }
  
   return a;*/
   List<Integer> list = new ArrayList<>();
   for(int i : a){
       if(i != -1){
           list.add(i);
       }
   }
   Collections.sort(list);
   int j=0;
   for(int i =0;i<a.length;i++){
       if(a[i]!=-1){
           a[i]=list.get(j++);
       }
   }
   return a;
}


}