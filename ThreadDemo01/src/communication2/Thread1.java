package communication2;

import java.util.ArrayList;

/**
 * 线程1
 */
public class Thread1 extends Thread{
    private ArrayList<Integer> list;

    public Thread1(ArrayList<Integer> list){
        this.list = list;
    }

    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            list.add(i);
            System.out.println("count："+i);
        }
    }
}
