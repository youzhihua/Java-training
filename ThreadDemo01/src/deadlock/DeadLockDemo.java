package deadlock;

public class DeadLockDemo extends Thread{

    private Object object1;
    private Object object2;


    public DeadLockDemo(Object o1,Object o2){
        this.object1 = o1;
        this.object2 = o2;
    }

    @Override
    public void run() {
        method1();
    }

    public void method1(){
        synchronized (object1){
            System.out.println("已经请求到了对象1的锁");
            System.out.println("正在请求对象2的锁");
            synchronized (object2){
                System.out.println("已经请求到了对象2的锁");
            }
        }
    }
}
