package Tree;

// import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
// import java.util.List;
import java.util.Queue;

public class PreandInordertobuildtreeandprintlevelorder {
    static class Node{
        int data;
        Node left;
        Node right;
        public Node(int data){
           this.data = data;
           this.left = null;
           this.right = null;
        }}
    public static void main(String[] args) {
        int preorder[] = {3,9,20,15,7};
        int inorder[] = {9,3,15,20,7};
        Node root = buildtree(preorder,inorder);
        printlevelorder(root);

    }
    public static int preorderindex;
    public static HashMap<Integer,Integer> inordermap;
    public static Node buildtree(int []preorder,int [] inorder){
         preorderindex = 0;
         inordermap = new HashMap<>();
         for(int i=0;i<inorder.length;i++){
            inordermap.put(inorder[i],i);
         }
         return helper(preorder,0,preorder.length-1);
    }
    public static Node helper(int [] preorder,int start,int end){
        if(start > end){
            return null;
        }
        int rootValue = preorder[preorderindex++];
        Node root = new Node(rootValue);
        root.left = helper(preorder,start,inordermap.get(rootValue)-1);
        root.right = helper(preorder,inordermap.get(rootValue)+1,end);
        return root;
    }
    public static void printlevelorder(Node root){
        // List<List<Integer>> answer = new ArrayList<>();
        if(root == null){
            return;
        }
        Queue<Node> q = new LinkedList<>();
        q.add(root);
        while(!q.isEmpty()){
            int size = q.size();
            while(size > 0){
                Node x = q.poll();
                System.out.print(x.data+" ");
                if(x.left !=null) q.add(x.left);
                if(x.right != null) q.add(x.right);
                 size--;
            }
            System.out.println();
        }
    }
    }
