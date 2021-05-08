package sample;

public class Test5 {
    public static void main(String[] args) {
        Dyanmic dyanmic = new Dyanmic();
        dyanmic.add(10);
        dyanmic.add(12);
        dyanmic.add(45);
        dyanmic.add(56);
        System.out.println("Add method: ");
        dyanmic.print();
        System.out.println("");
        System.out.println("Add Method with index: ");
        dyanmic.add(3,34);
        dyanmic.print();
        System.out.println("");

        dyanmic.remove(2);
        System.out.println("Remove index 2: ");
        dyanmic.print();
        System.out.println("");
        System.out.println(dyanmic.empty());
        System.out.println("");

        dyanmic.clear();
        System.out.println("Clear: ");
        dyanmic.print();

    }
}
