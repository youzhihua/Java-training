package communication3;

import java.util.ArrayList;

/**
 * 线程2
 */
public class Thread2 extends Thread {

    private ArrayList<Integer> list;

    public Thread2(ArrayList<Integer> list){
        this.list = list;
    }

    @Override
    public void run() {
        synchronized (list){
            if(list.size() < 10){
                System.out.println("不满足执行条件，进入等待状态");
                try {
                    list.wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("已被通知，停止等待");
            }
        }
    }
}
