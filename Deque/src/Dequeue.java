public class Dequeue {

    private int[] QArray;

    public void enqueue(int number){
        if (this.empty()){
            this.QArray = new int[1];
            this.QArray[0] = number;
        }else{
            int[] temp = new int[QArray.length + 1];
            for (int i = 0; i < QArray.length; i++) {
                temp[i] = QArray[i];
            }
            temp[temp.length - 1]= number;
            QArray = temp;
        }
    }

    public void dequeue(){

    }

    public boolean empty(){
        return true;
    }


    public void clear(){

    }

    public void print(){

    }

    public boolean contains(){
        return true;
    }

    public int size(){
        return 0;
    }



}
