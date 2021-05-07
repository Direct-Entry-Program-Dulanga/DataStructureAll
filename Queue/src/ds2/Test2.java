package ds2;

public class Test2 {
    public static void main(String[] args) {
        Queue queue = new Queue();

        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);
        queue.enqueue(40);
        queue.enqueue(50);
        queue.enqueue(60);
        queue.enqueue(70);
        queue.print();
        queue.dequeue();
        queue.dequeue();
        queue.print();

        System.out.println(queue.peek());
    }


}
