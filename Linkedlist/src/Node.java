public class Node {
    private int number;
    private Node next;

    public Node(int number, Node next) {
        this.setNumber(number);
        this.setNext(next);
    }

    public Node() {
    }


    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }
}
