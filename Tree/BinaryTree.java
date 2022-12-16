package Tree;

public class BinaryTree {
    Node root;
    BinaryTree(){
    //    this.root = root;
    }
    static class Node{
        int data;
        Node left;
        Node right;
        
                public Node(int data){
                    this.data = data;
                    this.left = null;
                    this.right = null;
                }
    }
    public static void main(String[] args) {
        Node root = new Node(3);
		root.left = new Node(1);
		root.right = new Node(2);
		root.right.left = new Node(1);
		root.right.right = new Node(1);

        // System.out.println(BinaryTree.diameter(root));
        System.out.println(sumparent(root));
    }
   
    public static int height(Node root){
        if(root == null){
            return 0;
        }
        int left = height(root.left);
        int right = height(root.right);
        return 1 + Math.max(left,right);
    }
 public static int diameter(Node root){
    if(root == null){
        return 0;
    }
    int leftDia = diameter(root.left);
    int rightDia = diameter(root.right);
    return Math.max(Math.max(leftDia,rightDia) , height(root));
 }
 public static boolean sumparent(Node root){
    if(root == null || (root.left == null && root.right == null)){
        return true;
    }
    int sum = 0;
    if(root.left != null){
        sum += root.left.data;
    }
    if(root.right != null){
        sum += root.right.data;
    }
    if(sum != root.data){
        return false;
    }
    return sumparent(root.left) && sumparent(root.right);
 }
}
