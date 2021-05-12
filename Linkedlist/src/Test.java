public class Test {
    public static void main(String[] args) {
        SinglyLinked list = new SinglyLinked();
        System.out.println("Empty: "+list.empty());
        System.out.println("list start");
        list.print();
        list.add(10);
        list.add(20);
        list.add(30);
        System.out.print("lists after add: ");
        list.print();
        System.out.println("");

        System.out.println("Size of list: "+list.size());
        System.out.println("");
        System.out.println("Empty: "+list.empty());
    }
}
