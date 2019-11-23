package demo3;

import java.util.Random;

public class ThreadLocalDemo implements Runnable{

    //设置一个threadLocal变量存储Integer
    private ThreadLocal<Integer> formatter = new ThreadLocal();

    @Override
    public void run() {
        System.out.println("Thread Name= "+Thread.currentThread().getId()+" 当前取到的值为 "+formatter.get());

        formatter.set(new Integer(new Random().nextInt(100)));

        System.out.println("Thread Name= "+Thread.currentThread().getId()+" 设置后的值为 = "+formatter.get());


    }

    public static void main(String[] args) throws InterruptedException {
        ThreadLocalDemo threadLocalDemo = new ThreadLocalDemo();
        Thread thread1 = new Thread(threadLocalDemo);
        Thread thread2 = new Thread(threadLocalDemo);
        Thread thread3 = new Thread(threadLocalDemo);
        Thread thread4 = new Thread(threadLocalDemo);
        Thread thread5 = new Thread(threadLocalDemo);
        Thread thread6 = new Thread(threadLocalDemo);
        thread1.start();
        thread1.join();
        thread2.start();
        thread2.join();
        thread3.start();
        thread3.join();
        thread4.start();
        thread4.join();
        thread5.start();
        thread5.join();
        thread6.start();
    }
}
