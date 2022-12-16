package StackandQueue;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class main {
  /*functions for bottom stack */
  public static void recursion(Stack<Integer>s){
    if(s.isEmpty()){
      return;
    }
    int data = s.peek();
    s.pop();
    recursion(s);
    addToBottom(s, data);
  }
  public static void addToBottom(Stack<Integer> s,int x){
    if(s.isEmpty()){
      s.push(x);
      return;
    }
    int data = s.peek();
    s.pop();
    addToBottom(s,x);
    s.push(data);
   }  
   public static void display(Stack<Integer>s){
    while(!s.isEmpty()){
      System.out.print(s.peek()+" ");
      s.pop();
    }  
   }
   /*End */
  public static void main(String[] args) {
      //  StackusingLinkList st = new StackusingLinkList();
      // // System.out.println(st.isEmpty());
      // st.push(1);
      // st.push(2);
      // st.push(3);
      //  st.display();
      // //  System.out.println(st.pop()); 
      // //  st.reverseStack();
      // st.removeMiddle(); 
      // st.display();
      //  System.out.println(st.size);
      //  StackusingArrayList st1 = new StackusingArrayList();
      // // System.out.println(st1.isEmpty());
      // st1.push(1);
      // st1.push(2);
      // st1.push(3);
      //  st1.display();
      //   st1.removeMiddle();
      //  //  System.out.println(st1.pop()); 
      // //  st1.reverse();
      //  st1.display();
      //  System.out.println(st.size);
      //  QueueusingLinkelist st2 = new QueueusingLinkelist();
      //  st2.enque(1);
      //  st2.enque(2);
      //  st2.enque(3);
      //  st2.enque(4);
      //  st2.enque(5);
      //  st2.display();
      // //  System.out.println(st2.deque());
      // //  st2.reverse();
      // //  st2.display();
      // //  System.out.println(st2.size);
      // //  System.out.println(st2.deque());
      // //  System.out.println(st2.removeMiddle());
      // st2.removeMiddle(); 
      // st2.display();
      
      
     
      Stack<Integer> s = new Stack<>();
      s.push(1);
      s.push(2);
      s.push(3);
      s.push(4);
      //  display(s);
      recursion(s);
      display(s);
    }
}
