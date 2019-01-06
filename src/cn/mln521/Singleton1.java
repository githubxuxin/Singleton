package cn.mln521;

/**
 *饿汉式单例（立即加载方式）
 */
public class Singleton1 {
    //私有构造
    private Singleton1(){

    }
    private static Singleton1 singleton = new Singleton1();

    //静态工厂方法
    public static Singleton1 getInstance() {
        return singleton;
    }

}
