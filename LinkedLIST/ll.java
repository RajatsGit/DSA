package LinkedLIST;
// import LinkedLIST.LInkelist;
// import java.util.Scanner;

class ll{
    public static void main(String[] args) {
    LInkelist list = new LInkelist();
    // System.out.println(list.addFirst(4));
    // System.out.println(list.addLast(9));
    list.addFirst(1);
    list.addLast(4);
    list.addLast(6);
    list.addLast(9);
    list.addLast(4);
    list.addLast(0);
    list.addLast(2);
    list.addLast(10);
    list.addLast(12);
    // list.addLast(13);
    list.display();
    System.out.println(list.linearSearchRec(-1));
    // list.mergesort();
    // list.Kgroups(3);
    // list.display();
//   System.out.println(list.removeFirst());
//   list.display();
//   System.out.println(list.removeFirst() +" "+ list.removeLast());
// list.display();
// System.out.println(list.deleteindex(1));
// list.display();  
// list.find(7);
// list.display();
// list.reverseafterMandbeforeNnodes(4, 6);
}
}