package deadlock;

public class DeadLockTest {

    public static void main(String[] args) {
        Object object1 = new Object();
        Object object2 = new Object();

        DeadLockDemo deadLockDemo1 = new DeadLockDemo(object1,object2);
        DeadLockDemo2 deadLockDemo2 = new DeadLockDemo2(object1,object2);

        deadLockDemo1.start();
        deadLockDemo2.start();
    }

}
