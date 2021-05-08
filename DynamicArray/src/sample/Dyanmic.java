package sample;

public class Dyanmic {

    private int[] arrayDyanmic;

    public void add(int number) {
        add(size(), number);
    }

    public void add(int index, int number){
        int[] temp = new int[arrayDyanmic.length+1];
        for (int i = 0; i < temp.length; i++) {
            if(i < index){
                temp[i] = arrayDyanmic[i];
            }else if(i == index) {
                temp[i] = number;
            }else{
                temp[i] = arrayDyanmic[i-1];
            }
        }
        arrayDyanmic = temp;
    }


    public void remove(int index){
        if(index >= arrayDyanmic.length || index< 0){
            throw new RuntimeException("Invalid Array index");
        }
        if (size()-1 ==0){
            clear();
            return;
        }
        int[] temp = new int[size()-1];
        for (int i = 0; i < temp.length; i++) {
            if(i<index){
                temp[i] = arrayDyanmic[i];
            }else if (i >= index){
                temp[i] = arrayDyanmic[i+1];
            }
        }
        arrayDyanmic = temp;

    }

    public int get(int index){
        if (index >= size() || index < 0){
            throw new RuntimeException("Invalid array index");
        }
        return arrayDyanmic[index];
    }

    public void print(){
        System.out.print("[ ");
        for (int i = 0; i < arrayDyanmic.length ; i++) {
            System.out.print(arrayDyanmic[i]+" ");
        }
        System.out.print("\b]");
        System.out.println("");
    }

    public void clear() {
        arrayDyanmic = null;
    }

    public boolean empty() {
        return (arrayDyanmic == null);
    }


    public int size() {
        return (arrayDyanmic == null) ? 0 : arrayDyanmic.length;
    }

    public boolean contains(int number){
        return true;
    }

}
