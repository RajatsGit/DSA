package LinkedLIST;

public class LInkelist {
    private Node head;
    private Node tail;
    int size;
    private int val;
    public LInkelist() {
        this.size = 0;
    }
    class Node{
        public int val;
        public Node next;
       
        public Node(int val) {
            this.val = val;
            this.next = null;
        }
    
        public Node(int val, Node next) {
            this.val = val;
            this.next = next;
        }}
    public Node addFirst(int val){
        Node n = new Node(val);
        n.next = this.head;
        this.head = n;
        if(size==0){
            this.tail = this.head;
        } 
        this.size++;
        return head;
    }
    public void display(){
       Node temp =head;
        while(temp!=null){
            System.out.print(temp.val+ " ");
            temp = temp.next;
        }
        System.out.println();
    }
    public void addLast(int val){
        if(tail == null){
            addFirst(this.val);
            return;
        }
        Node n = new Node(val);
        this.tail.next = n;
        this.tail = n;
        size++;
    }
    public void addIndex(int val, int index){
        if(index == 0){
            addFirst(this.val);
            return;
        }
        if(index == size){
            addLast(this.val);
            return;
        }
        Node temp = head;
        for(int i=1;i<index;i++){
            temp = temp.next;
        }
        Node n = new Node(val,temp.next);
         temp.next = n;
         size++;
        }
        public int removeFirst(){
            int val = head.val;
            head = head.next;
            if(head == null){
                tail = null;
            }
            size--;
            return val;
        }
        public Node get(int index){
            Node n = head;
            for(int i=0;i<index;i++){
                n = n.next;
            }
            return n;
        }
        public int removeLast(){
           if(size<=1){
            return removeFirst();
           }
           int val = tail.val;
            tail =  get(size-2);
            tail.next = null;
           size--;
            return val;
        }
        public int deleteindex(int index){
            if(index == 0){
                return removeFirst();
            }
            if(index == size-1){
                return removeLast();
            }
            Node n = get(index-1);
            int val = n.next.val;
            n.next = n.next.next;
            return val;
        }
        public Node find(int value){
            Node temp = head;
            while(temp != null){
               if (temp.val == value){
                return temp;
               }
               temp = temp.next;
            }
        return temp;}
   
    public void reverseafterMandbeforeNnodes(int m, int n){
        Node temp = this.head;
        int count=0;
        while(temp!=null && count<m){
            temp = temp.next;
            count++;
        }
        Node pointer = temp;
        while(temp!=null && count<=n){
            temp = temp.next;
            count++;
        }
        Node nNode = temp;
        Node curr = pointer.next;
        Node prev = null;
        while(curr!=nNode){
            Node next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        Node tail = pointer.next;
        tail.next = curr;
        pointer.next = prev;
        Node temp1 = head;
        while(temp1!=null){
            System.out.print(temp1.val+"->");
            temp1 = temp1.next;
        }
        System.out.println("END");
    } 
    public Node merge(Node l1, Node l2){
        Node newhead = new Node(0);
        Node dummyhead = newhead;
        while(l1!=null && l2!=null){
            if(l1.val < l2.val){
                dummyhead.next = l1;
                dummyhead = dummyhead.next;
                l1 = l1.next;
            }
            else{
                dummyhead.next = l2;
                dummyhead = dummyhead.next;
                l2 = l2.next;
            }
        }
        if(l1!=null){
            dummyhead.next = l1;
        }
        
        if(l2!=null){
            dummyhead.next = l2;
            }
        return newhead.next;
    }
    public Node getMid(Node temp){
        Node slow = temp;
        Node fast = temp;
        Node prev = null;
        while(fast!=null && fast.next!=null){
            prev = slow;
            slow = slow.next;
            fast = fast.next.next;
        }
        prev.next = null;
        return slow;
    }
    public void mergesort(){
    Node temp  =  mergesort(this.head);
    while(temp!=null){
        System.out.print(temp.val+"->");
        temp = temp.next;
    }
     System.out.println("END");
    }
    private Node mergesort(Node head){
        if(head == null || head.next == null)
          {return head;
          }
          Node mid = getMid(head);
          Node left = mergesort(head);
          Node right = mergesort(mid);
          return merge(left, right); 
    }
    public void reverserecursion(){
        Node temp = this.head;
        Node n = recursion(temp);
    }
    private Node recursion(Node head){
        if(head.next == null){
            return head;
        }
        Node temp = recursion(head.next);
        temp.next = head;
        head.next = null;
        head = temp;
        return head;
    }
    public void Kgroups(int k){
        Node newHead = new Node(0);
        Node pointer = newHead;
        pointer.next = head;
        while(pointer != null){
            Node temp = pointer;
            for(int i=0;i < k & temp!=null;i++){
                temp = temp.next;}
            if(temp == null){
                break;
            }
            Node current = pointer.next;
            Node previous = null;
            for(int i=0;i<k;i++){
                Node next = current.next;
                current.next = previous;
                previous = current;
                current = next;
            }
            Node tail = pointer.next;
            pointer.next = previous;
            tail.next = current;
            pointer = tail;
        }
        Node temp2 = newHead.next;
        while(temp2 !=null){
            System.out.print(temp2.val + " ");
            temp2 = temp2.next;
        }
        System.out.println();
    }
    public static int getSize(Node head){
      Node temp = head;
      int count=0;
      while(temp != null){
        temp = temp.next;
        count++;
      }
    return count;}
    public  int linearSearchRec(int x){
        Node temp = head;
        int count = 0;
        return ls(temp,x,count);
    }
    public int ls(Node head,int x,int count){
        if(head == null){
            return -1;
        }
        if(head.val == x){
            return count;
        }
        return ls(head.next,x,count+1);
    }
}
