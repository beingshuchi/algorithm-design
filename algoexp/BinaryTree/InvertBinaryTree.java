public class InvertBinaryTree{
public void invertBT(BinaryTree root){
  if(root == null)retrun;
  invertBT(root.left);
  invertBT(root.right);
  if(root.left!=null && root.right !=null){
     BinaryTree temp = root.left;//4
	 root.left =root.right;//5
	 root.right=temp;//4
  }
}
}