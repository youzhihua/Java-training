package communication1;

/**
 * 线程1
 */
public class Thread1 extends Thread{
    private DemoObject demoObject;

    public Thread1(DemoObject demoObject){
        this.demoObject = demoObject;
    }

    @Override
    public void run() {
        demoObject.method1();
    }
}
