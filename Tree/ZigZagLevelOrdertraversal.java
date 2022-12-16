package Tree;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Stack;

public class ZigZagLevelOrdertraversal {
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
    public static void main(String[] args) {
        TreeNode root = new TreeNode(5);
         root.left = new TreeNode(2);
         root.right = new TreeNode(3);
         root.left.left = new TreeNode(12);
         root.left.right = new TreeNode(13);
         root.right.left = new TreeNode(14);
         root.right.right = new TreeNode(15);
         root.right.left.left = new TreeNode(0);
         root.right.right.right = new TreeNode(-1); 
         levelorderzigzag(root);
         zigzaglevelordertraversalusingDeque(root);
    }
    public static void zigzaglevelordertraversalusingDeque(TreeNode root){
        if(root == null){
            return;
        }
        Deque<TreeNode> dq = new LinkedList<>();
        dq.addLast(root);
        boolean flag = false;
        while(!dq.isEmpty()){
            int size = dq.size();
            while(size > 0){
                if(flag == true){
                TreeNode x = dq.pollFirst();
                System.out.print(x.data+" ");
                if(x.right != null){dq.addLast(x.right);}
                if(x.left != null){dq.addLast(x.left);}}
                if(flag == false){
                    TreeNode x = dq.pollLast();
                    System.out.print(x.data+" ");
                    if(x.left != null){dq.addFirst(x.left);}
                    if(x.right != null){dq.addFirst(x.right);}
                    }
                               size--;   
        }
            flag = !flag ; 
            System.out.println();
    }}
    public static void levelorderzigzag(TreeNode root){
        if(root == null){
            return;
        }
        Stack<TreeNode> st = new Stack<>();
        Stack<TreeNode> helper = new Stack<>();
        st.add(root);
        while(!st.isEmpty() || !helper.isEmpty()){
            if(helper.isEmpty()){
                int size = st.size();
                while(size > 0){
                    TreeNode x = st.pop();
                    System.out.print(x.data+" ");
                    if(x.left != null){helper.add(x.left);}
                    if(x.right != null){helper.add(x.right);}
                    size--;
                } 
                System.out.println();
            }
            if(st.isEmpty()){
                int size = helper.size();
                while(size > 0){
                    TreeNode x = helper.pop();
                    System.out.print(x.data+" ");
                    if(x.right != null){st.add(x.right);}
                    if(x.left != null){st.add(x.left);}
                    size--;
                } 
                System.out.println();
            }
        }
     }

}
