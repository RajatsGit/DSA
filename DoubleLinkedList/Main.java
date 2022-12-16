package DoubleLinkedList;
// import DoubleLinkedList.*;
public class Main {
    public static void main(String[] args) {
        DLL list = new DLL();
        list.addFirst(99);
        list.addFirst(98);
        list.addFirst(97);
        list.addFirst(96);
        list.addFirst(95);
        list.addLast(100);
        // list.addIndex(2, -1);
        list.display();
    }
}
