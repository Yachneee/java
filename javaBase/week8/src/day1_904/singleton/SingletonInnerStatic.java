package day1_904.singleton;

/**
 * @author Administrator
 */
public class SingletonInnerStatic {
    private SingletonInnerStatic(){}
    static class Inner{
        private static SingletonInnerStatic instance=new SingletonInnerStatic();
    }
    public static SingletonInnerStatic getInstance(){
        return Inner.instance;
    }
}
