package demo1;

/**
 * 双重校验锁 实现单例模式
 */
public class SinglePattern {

    private static volatile SinglePattern singlePattern;

    private SinglePattern(){}

    public static SinglePattern getInstance(){
        if(singlePattern == null){
            synchronized(SinglePattern.class){
                if(singlePattern == null){
                    singlePattern = new SinglePattern();
                }
            }
        }
        return singlePattern;
    }
}
