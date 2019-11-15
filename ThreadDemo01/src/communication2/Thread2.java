package communication2;

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
        while(true){
            if(list.size() == 10){
                System.out.println("thread2 开始工作");
                System.out.println("thread2 结束工作");
                break;
            }
        }
    }
}
