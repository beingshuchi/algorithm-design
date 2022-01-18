public class CaculateRiverSizes {

List<Integer> caculateRiverSizes(int [][]input){
int m = input.length;
int n = input[0].length;
boolean[][] visited = new boolean[m][n];

List<Integer> sizes = new ArrayList<>();

for(int i=0;i<m;i++){
for(int j=0;j<n;j++){
if(input[i][j] != 0 && !visited[i][j]){
  int size = calculateSize(input, i, j, m, n, visited);
  sizes.add(size);
}
}
}

return sizes;

}

private int calculateSize(int [][]input, int i, int j, int m, int n, boolean visited[][]){
Queue<int[]> queue = new LinkedList<>();
queue.add(new int[]{i,j});
int size = 0;
while(!queue.isEmpty()){
  int[] removed = queue.poll();
  int curr_i = removed[0];
  int curr_j = removed[1];
  if(visited[curr_i][curr_j])continue;
  visited[curr_i][curr_j]=true;
  size++;
  if(!isOutOfBounds(curr_i-1,curr_j,m,n) && !visited[curr_i-1][curr_j] && input[curr_i-1][curr_j]!=0){
     queue.add(new int[]{curr_i-1,curr_j});
  }
  if(!isOutOfBounds(curr_i+1,curr_j,m,n) && !visited[curr_i+1][curr_j] && input[curr_i+1][curr_j]!=0){
     queue.add(new int[]{curr_i+1,curr_j});
  }
  if(!isOutOfBounds(curr_i,curr_j-1,m,n) && !visited[curr_i][curr_j-1] && input[curr_i][curr_j-1]!=0){
     queue.add(new int[]{curr_i,curr_j-1});
  }
  if(!isOutOfBounds(curr_i,curr_j+1,m,n) && !visited[curr_i][curr_j+1] && input[curr_i][curr_j+1]!=0){
     queue.add(new int[]{curr_i,curr_j+1});
  }
}
return size;
}


private boolean isOutOfBounds(int i, int j, int m, int n){
return i < 0 || j < 0 || i >=m || j >=n;
}

}