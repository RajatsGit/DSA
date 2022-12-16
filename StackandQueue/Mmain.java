package StackandQueue;

public class Mmain {
    public static void main(String[] args) {
        ImplementCircularQueue cq = new ImplementCircularQueue(5);
        cq.enQueue(1);
        cq.enQueue(2);
        cq.enQueue(3);
        cq.enQueue(4);
        cq.enQueue(5);
        cq.display();
        cq.deQueue();
        cq.deQueue();
        cq.deQueue();
        cq.deQueue();
        cq.deQueue();
        cq.display();
    }
}
