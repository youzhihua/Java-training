package communication3;

import java.util.ArrayList;

/**
 * 测试类
 */
public class Test01 {
    public static void main(String[] args) {
        //创建示例对象
        ArrayList<Integer> list = new ArrayList();
        //线程1
        Thread thread1 = new Thread1(list);
        //线程2
        Thread thread2 = new Thread2(list);

        thread2.start();
        thread1.start();
    }
}
