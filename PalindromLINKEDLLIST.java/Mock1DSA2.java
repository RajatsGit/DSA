public class Mock1DSA2{
   
    Node head;
   public Mock1DSA2() {
       this.head = null;
   }
   class Node{
       int data;
       Node next;
       Node(int data){
           this.data = data;
           this.next = null;
       }}
   public void addFirst(int value){
    Node n  = new Node(value);
    if(head == null){
       head = n;
       return;
    }
    n.next = head;
    head = n;
    return;
   }
    public void display(){
       Node temp = this.head;
       while(temp!=null){
           System.out.print(temp.data+"->");
           temp = temp.next;
       }  
       System.out.println("END");      
    }
    private Node gettail(){
       Node tail = this.head;
       while(tail.next!=null){
           tail = tail.next;
       }
       return tail;
    }
    public void addLast(int value){
       Node n = new Node(value);
       Node tail = gettail(); 
       if(head == null){
           head = n;
           tail = head;
           return;
       }
       tail.next = n;
       tail = n;
       return;
    }
    public void reverseList(){
       Node current = this.head;
       Node previous = null;
       while(current!=null){
           Node next = current.next;
           current.next = previous;
           previous = current;
           current = next;
       }
       while(previous!=null){
           System.out.print(previous.data+"->");
           previous = previous.next;
       }
       System.out.println("END");
       return;
    }
     public void reverseRecursion(){
       this.reverserec(this.head);
       Node tail = gettail();
       Node n = head;
       head = tail;
       tail = n;
       // return;
     }
     private void reverserec(Node current){
       if(current.next == null){
           return;
       }
       reverserec(current.next);
       Node nextNode = current.next;
       nextNode.next = current;
       current.next = null;
     }
     public int getSize(){
       Node temp =head;
       int count=0;
       while(temp!=null){
         count++;
         temp = temp.next;
       }
     return count;}
     public void reversedataRecursion(){
       left = this.head;
       reverse(this.head,0);
     }
     private Node left = head;
     private void reverse(Node right,int rightindex){
        if(right == null){
           return;
        }
        reverse(right.next, rightindex+1);
        if(rightindex >= getSize()/2){
             int x = left.data;
             left.data = right.data;
             right.data = x;
              left = left.next;
        }
     }
     public boolean check(){
       left = this.head;
       return checkPalindrome(left);
     }
     public boolean checkPalindrome(Node right){
        if(right == null){
           return true;
        }
        boolean ans = checkPalindrome(right.next);
       boolean x;
        if(left.data == right.data){
         x = true;
        }
        else{
       x = false;
        }
        left= left.next;
        return ans && x; 
       }
       public int getMid(){
         Node fast = this.head;
         Node slow = this.head;
         while(fast!=null && fast.next!=null){
           slow =slow.next;
           fast = fast.next.next;
         }
         return slow.data;
       }
       public void removeDuplicates(){
         Node temp = this.head;
         while(temp.next!=null){
           if(temp.data == temp.next.data){
             temp.next = temp.next.next;
           }
           temp = temp.next;
         }
       }
   }