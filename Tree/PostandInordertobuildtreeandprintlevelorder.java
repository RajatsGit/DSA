package Tree;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class PostandInordertobuildtreeandprintlevelorder {
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
        int postorder[] = {9,15,7,20,3};
        int inorder [] = {9,3,15,20,7};
        Node root = buildtree(postorder,inorder);
        System.out.println(printlevelorderRecursively(root));
    }
    public static int postorderindex;
    public static HashMap<Integer,Integer> inorderMap;
    public static Node buildtree(int postorder[],int []inorder){
         postorderindex = postorder.length-1;
         inorderMap = new HashMap<>();
         for(int i=0;i<inorder.length;i++){
            inorderMap.put(inorder[i],i);
         }
         return helper(postorder,0,postorder.length-1);
    }
    public static Node helper(int postorder[],int start,int end){
        if(start > end){
            return null;
        }
        int rootValue = postorder[postorderindex--];
        Node root = new Node(rootValue);
        root.right = helper(postorder,inorderMap.get(rootValue)+1,end);
        root.left = helper(postorder, start, inorderMap.get(rootValue)-1);
        return root;
    }
    public static List<List<Integer>> printlevelorderRecursively(Node root){
        List<List<Integer>> answer = new ArrayList<>();
        if(root == null){
            return answer;
        }
        int level = 0;
        helper2(root,answer,level);
        return answer;
    }
    public static void helper2(Node root,List<List<Integer>>answer,int level){
        if(root == null){
            return;
        }
        else{
            if(level == answer.size()){
                answer.add(new ArrayList<>());
            }
            answer.get(level).add(root.data);
            helper2(root.left, answer, level+1);
            helper2(root.right, answer, level+1);
            return;
        }
    } 
}
