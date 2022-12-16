package Tree;

import java.util.ArrayList;
import java.util.List;

public class InorderTraversal {
    public static void main(String[] args) {
        TreeNode root = new TreeNode(0);
        root.left = new TreeNode(1);
        root.right = new TreeNode(2);
        root.left.left = new TreeNode(3);
        root.left.right = new TreeNode(4);
        root.right.left = new TreeNode(5);
        root.right.right = new TreeNode(6);
        System.out.println(inorderTraversal(root));
    }
    public static List<Integer> inorderTraversal(TreeNode root){
        List<Integer> ans = new ArrayList<>();
        helper(root,ans);
        return ans;
    }
    public static void helper(TreeNode root, List<Integer> ans){
        if(root != null){
            helper(root.left,ans);
            ans.add(root.data);
            helper(root.right,ans);
            return;
        }
    }
    public static class TreeNode{
        int data;
        TreeNode left;
        TreeNode right;
          TreeNode(int data){
            this.data = data;
            left = null;
            right = null;
          }
    }
}
