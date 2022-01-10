/*
Node depth

   0- 1 (0+5+11)--> 16
	/     \
 1-2(1+2+2)    1-3-(1+8+2)
  / \      / \
2-4-2 2-5-2  6-8  7-2
          /\
         8-3	9-3

#1 -->recursion
Assuming: null -- 0
    -- left and right child are null -- 0	
	
  |1-0|
  
  
*/


import java.util.*;

class NodeDepth {

  public static int nodeDepths(BinaryTree root) {
    // Write your code here.
    return caluclateSum(root,0);//1,0
  }
  
  private static int caluclateSum(BinaryTree node, int depth){
	  if(node == null)return 0;
	  return (depth + caluclateSum(node.left, depth+1)+caluclateSum(node.right,depth+1))//0+(1+2+2)+(1+2+3+3+2)
  }

  static class BinaryTree {
    int value;
    BinaryTree left;
    BinaryTree right;

    public BinaryTree(int value) {
      this.value = value;
      left = null;
      right = null;
    }
  }
}
