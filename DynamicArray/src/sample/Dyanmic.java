package sample;

public class Dyanmic {
    private int[] arrayDyanmic;

    public void add1(int number){
        if(arrayDyanmic == null){
            arrayDyanmic = new int[1];
            arrayDyanmic[0] = number;
        }else{
            int[] temp = new int[arrayDyanmic.length+1];
            for (int i = 0; i < arrayDyanmic.length; i++) {
                temp[i] = arrayDyanmic[i];
            }
            temp[temp.length-1] = number;
            arrayDyanmic = temp;
        }
    }

    public void add(int index, int number){
        int[] temp = new int[arrayDyanmic.length+1];
        for (int i = 0; i < arrayDyanmic.length; i++) {
            if(i == index){
                temp[i] = arrayDyanmic[i];


            }
            temp[i] = number;
            System.out.println(arrayDyanmic[i]);
        }
        temp[0] = number;
        arrayDyanmic = temp;

    }


    public void remove(int index){

    }

    public void get(int index){

    }

    public void print(){
        if(empty()){
            System.out.println("[]");
            return;
        }
        System.out.print("[ ");
        for (int i = 0; i < arrayDyanmic.length ; i++) {
            System.out.print(arrayDyanmic[i]+" ");
        }
        System.out.print("\b]");
        System.out.println("");
    }

    public void clear(){

    }

    public int size(){
        return 0;
    }

    public boolean contains(int number){
        return true;
    }

    public boolean empty(){
        return true;
    }
}
