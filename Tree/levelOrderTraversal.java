package Tree;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
public class levelOrderTraversal {
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
    //    int a[] = {1,2,2,3,4,4,3};
        // TreeNode root = buildTree(a, 0, a.length-1);
        TreeNode root = new TreeNode(5);
         root.left = new TreeNode(2);
         root.right = new TreeNode(3);
         root.left.left = new TreeNode(0);
         root.left.right = new TreeNode(4);
         root.right.left = new TreeNode(9);
         root.right.right = new TreeNode(8);
          System.out.println(levelOTraversal(root));
          System.out.println(levelordeeRecursively(root));
          HashMap<Integer,List<Integer>> map = levelordeeRecursivelyusingHashMap(root);
          for(int i=0;i<map.size();i++){
            System.out.println(map.get(i));
          }
          for(int i=0;i<map.size();i++){
               List<Integer> list = map.get(i);
               for(int j=0; j<=0;j++){
                System.out.println(list.get(j));
               }
          }
        }
        public static List<List<Integer>> levelordeeRecursively(TreeNode root){
            List<List<Integer>> answer = new ArrayList<>();
            if(root == null){
                return answer;
            }
            int level = 0;
            helper(answer,root,level);
            return answer;
        }
        public static void helper(List<List<Integer>>answer,TreeNode root,int level){
            if(root == null){
                return;
            }
            else{
                if(level >= answer.size()){
                    answer.add(new ArrayList<>());
                }
                answer.get(level).add(root.data);
                helper(answer,root.left,level+1);
                helper(answer,root.right,level+1);
                return;
            }
        }
     public static List<List<Integer>> levelOTraversal(TreeNode root){
        List<List<Integer>> answer = new ArrayList<>();
        if(root == null){
          return answer;
        }
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        while(!q.isEmpty()){
            int size = q.size();
            List<Integer> list = new ArrayList<>();
            while(size > 0){
                TreeNode x = q.poll();
                list.add(x.data);
                if(x.left != null){q.add(x.left);}
                if(x.right != null){q.add(x.right);}
                size--;
            }
            answer.add(list);
        }
     return answer;}
     public static HashMap<Integer,List<Integer>> levelordeeRecursivelyusingHashMap(TreeNode root){
        HashMap<Integer,List<Integer>> answer = new HashMap<>();
        if(root == null){
            return answer;
        }
        int level = 0;
        helper2(answer,root,level);
        return answer;
    }
    public static void helper2(HashMap<Integer,List<Integer>>answer,TreeNode root,int level){
        if(root == null){
            return;
        }
        else{
            if(level == answer.size()){
                answer.put(level,new ArrayList<>());
            }
            answer.get(level).add(root.data);
            helper2(answer,root.left,level+1);
            helper2(answer,root.right,level+1);
            return;
        }
    }
    }
