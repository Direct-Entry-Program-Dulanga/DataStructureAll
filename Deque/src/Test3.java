public class Test3 {
    public static void main(String[] args) {
        Dequeue dequeue = new Dequeue();
        System.out.println(dequeue.empty());      // true
        dequeue.enqueue(10);
        System.out.println(dequeue.empty());      // false
        dequeue.enqueue(20);
        dequeue.enqueue(-1);
        dequeue.print();
        dequeue.dequeue();
        dequeue.dequeue();
        dequeue.dequeue();
        dequeue.print();
    }
}
