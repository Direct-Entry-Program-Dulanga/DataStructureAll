import java.util.Queue;

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
        if (empty()){
            System.err.println("Can't dequeue from empty queue");
            return;
        }else if (QArray.length == 1){
            QArray = null;
            return;
        }
        int[] temp = new int[QArray.length - 1];
        for (int i = 0; i < temp.length; i++) {
            temp[i] = QArray[i+1];
        }
        QArray = temp;
    }

    public boolean empty(){
        return this.QArray == null;
    }


    public void clear(){
        QArray = null;
    }

    public void print(){
        if (empty()){
            System.out.println("[]");
            return;
        }
        System.out.print("[");
        for (int i = QArray.length - 1; i >=0 ; i--) {
            System.out.print(QArray[i] + " ");
        }
        System.out.println(" ]");
    }

    public boolean contains(){
        return true;
    }

    public int size(){
        return 0;
    }



}

class Deq extends Dequeue{
    public void enqueueRear(int number){

    }

    public void dequeueFront(){

    }
}
