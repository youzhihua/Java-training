package deadlock;

public class DeadLockDemo2 extends Thread{

    private Object object1;
    private Object object2;


    public DeadLockDemo2(Object o1,Object o2){
        this.object1 = o1;
        this.object2 = o2;
    }

    @Override
    public void run() {
        method2();
    }

    public void method2(){
        synchronized (object2){
            System.out.println("已经请求到了对象2的锁");
            System.out.println("正在请求对象1的锁");
            synchronized (object1){
                System.out.println("已经请求到了对象1的锁");
            }
        }
    }

}
