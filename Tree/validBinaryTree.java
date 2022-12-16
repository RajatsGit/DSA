package Tree;

public class validBinaryTree {
    public static class TreeNode{
        int data;
        TreeNode left;
        TreeNode right;
           TreeNode(int data){
            this.data = data;
            this.left = null;
            this.right = null;
           }
    }
    public static int index=-1;
    public static TreeNode buildTree(int a[],int start,int end){
       if(start > end){
        return null;
       }
       int mid = (start+end)/2;
       TreeNode root = new TreeNode(a[mid]);
       root.left = buildTree(a, start, mid-1);
       root.right = buildTree(a, mid+1, end);
        return root;
    }
    public static void main(String[] args) {
        int a[] = {1,2,3,4,5,6,7,8,9,26};
        TreeNode root = buildTree(a,0,a.length-1);
        System.out.println(isValidBinaryTree(root));
        
    }
    public static boolean isValidBinaryTree(TreeNode root){
        return isValid(root,Long.MIN_VALUE,Long.MAX_VALUE);
    }
    public static boolean isValid(TreeNode root,long minval, long maxval){
        if(root == null){
            return true;
        }
        if(root.data <= minval || root.data >= maxval){
            return false;
        }
        return isValid(root.left, minval, root.data) && isValid(root.right, root.data, maxval);
    }
}
