public class Stack {
    private int[] stack;

    public void push(int n){

        if(stack == null){
            stack = new int[1];
            stack[0] = n;
        }else{
            int[] temp = new int[stack.length+1];
            for (int i = 0; i < stack.length; i++) {
                temp[i] = stack[i];
            }
            temp[temp.length-1] = n;
            stack = temp;
        }

    }

    public void pop(){
        if (stack == null) {
            System.out.println("Can't pop");
        } else if (stack.length == 1) {
            stack = null;
        } else {
            int[] temp = new int[stack.length - 1];
            for (int i = 0; i < temp.length; i++) {
                temp[i] = stack[i];
            }
            stack = temp;
        }

    }

    public boolean empty(){
        return stack == null;
    }

    public int peek(){
        if (empty()){
            System.err.println("Stack is empty");
        }
        return stack[stack.length - 1];
    }

    public void clear(){
        stack = null;
    }

    public int size(){
        return empty() ? 0 :  stack.length;
    }

    public void print(){
        if(empty()){
            System.out.println("[]");
            return;
        }
        System.out.print("[\n");
        for (int i = stack.length - 1; i >= 0 ; i--) {
            System.out.println(stack[i]+" ");
        }
        System.out.print("\b\b]");
        System.out.println("");
    }

    public boolean contains(int n) {
        if (empty()){
            return false;
        }
        for (int i = 0; i < stack.length; i++) {
            if (stack[i] == n){
                return true;
            }
        }
        return false;
    }
}
