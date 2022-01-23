public class AlternatingSums{
	int[] solution(int[] a) {
  int even =0;
  for(int i=0;i<a.length;i = i + 2){
      even += a[i];
  }
  int odd =0;
  for(int i=1;i<a.length;i = i + 2){
      odd += a[i];
  }
  return new int[]{even,odd};
}

}