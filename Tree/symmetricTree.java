package Tree;

import java.util.LinkedList;
import java.util.Queue;

public class symmetricTree {
    static class TreeNode{
        int data;
        TreeNode left;
        TreeNode right;
        TreeNode(int data){
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }
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
    //    int a[] = {1,2,2,3,4,4,3};
        // TreeNode root = buildTree(a, 0, a.length-1);
        TreeNode root = new TreeNode(5);
         root.left = new TreeNode(3);
         root.right = new TreeNode(3);
         root.left.left = new TreeNode(8);
         root.left.right = new TreeNode(9);
         root.right.left = new TreeNode(9);
         root.right.right = new TreeNode(8);
        System.out.println(isSymmetricrecursively(root)); 
        System.out.println(isSymmetriciteratively(root));
    }
    public static boolean isSymmetricrecursively(TreeNode root){
        if(root == null || (root.left == null && root.right == null)){
            return true;
        }
        return isMirror(root.left,root.right);
    }
    public static boolean isMirror(TreeNode left, TreeNode right){
        if(left == null && right == null){
            return true;
        }
        if(left == null || right == null || left.data != right.data){
            return false;
        }
        return isMirror(left.left, right.right) && isMirror(left.right, right.left);
    }
    public static boolean isSymmetriciteratively(TreeNode root){
        if(root == null){
            return true;
        }
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root.left);
        q.add(root.right);
        TreeNode l,r;
        while(!q.isEmpty()){
           l = q.poll();
           r = q.poll();
           if(l == null && r == null){
            continue;
           }
           if(l == null || r == null || l.data != r.data){
            return false;
           }
           q.add(l.left);
           q.add(r.right);
           q.add(l.right);
           q.add(r.left);
        }
        return true;
    }
}
