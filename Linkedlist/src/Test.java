public class Test {
    public static void main(String[] args) {
        SinglyLinked list = new SinglyLinked();
        list.print();
        list.add(10);
        list.add(20);
        list.add(30);
        list.print();
        System.out.println("");
        System.out.println("Size of list: "+list.size());
    }
}
