public class MatrixElementsSum{
	/**
	 [[0, 1, 1, 2],
      [0, 5, 0, 0], 
      [2, 0, 3, 3]]
	  
	  [[0, 1, 1, 2], 
      [0, 5, 0, 0], 
      [0, 0, 0, 0]]
	  
	  1. if m[i][j]==0 and i+1> m.length make all the rooms below m[i][j] = 0
	  2. else add in the total
	  time: O(mn)
	  space: O(1)
	*/
public int matrixElementsSum(int [][]matrix){
int sum = 0;
    boolean visited[][] = new boolean[matrix.length][matrix[0].length];
    for(int i=0;i<matrix.length;i++){
        for(int j=0;j<matrix[i].length;j++){
            if(matrix[i][j]!=0){
                sum+=matrix[i][j];
            }else{
                if((i+1)<matrix.length){
                    matrix[i+1][j]=0;
                }
            }
        }
    }
    return sum ;
}
}