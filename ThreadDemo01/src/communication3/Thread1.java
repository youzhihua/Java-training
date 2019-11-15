package communication3;

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
        synchronized (list){
            for (int i = 0; i < 100; i++) {
                list.add(i);
                if(i == 10){
                    list.notify();
                    System.out.println("已经通知其他线程停止等待状态");
                }
                System.out.println("count："+i);
            }
        }
    }
}
