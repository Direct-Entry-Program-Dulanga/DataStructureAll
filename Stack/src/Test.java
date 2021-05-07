public class Test {
    public static void main(String[] args) {
        Stack stack = new Stack();
        System.out.println(stack.empty());
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);
        stack.push(50);
        stack.push(60);
        System.out.println(stack.empty());
        System.out.println("");
        System.out.println("Size: "+stack.size());
        System.out.println("");
        stack.print();
        stack.pop();
        stack.pop();
        stack.pop();
        stack.pop();
        System.out.println(" ");
        stack.print();
        System.out.println("");
        System.out.println("Peek: "+stack.peek());

        System.out.println("");
        System.out.println("clear: ");
        stack.clear();
        stack.print();

        System.out.println("constains: "+stack.contains(40));
    }
}
