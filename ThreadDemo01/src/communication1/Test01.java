package communication1;

/**
 * 测试类
 */
public class Test01 {
    public static void main(String[] args) {
        //创建示例对象
        DemoObject demoObject = new DemoObject();
        //线程1
        Thread thread1 = new Thread1(demoObject);
        //线程2
        Thread thread2 = new Thread2(demoObject);

        thread1.start();
        thread2.start();
    }
}
