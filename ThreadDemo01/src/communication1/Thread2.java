package communication1;

/**
 * 线程2
 */
public class Thread2 extends Thread {

    private DemoObject demoObject;

    public Thread2(DemoObject demoObject){
        this.demoObject = demoObject;
    }

    @Override
    public void run() {
        demoObject.method2();
    }
}
