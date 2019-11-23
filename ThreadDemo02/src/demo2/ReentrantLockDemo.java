package demo2;

/**
 * 重入锁示例代码
 */
public class ReentrantLockDemo {


    public synchronized void getLock1(){
        System.out.println("获取对象锁的method1");
        getLock2();
    }

    public synchronized void getLock2(){
        System.out.println("获取对象锁的method2");
    }

    public static void main(String[] args) {
        new ReentrantLockDemo().getLock1();
    }
}
