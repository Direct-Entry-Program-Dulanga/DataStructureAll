package ds;


import ds2.Queue;

public class Deque2 extends Queue {

    public void enqueue2(int number){
        if(ArrayQ == null){
            ArrayQ = new int[1];
            ArrayQ[0] = number;
        }else{
            int[] temp = new int[ArrayQ.length+1];
            for (int i = 0; i < ArrayQ.length; i++) {
                temp[i] = ArrayQ[i];
            }
            temp[temp.length-1] = number;
            ArrayQ = temp;
        }
    }
}
