package cn.mln521;

/**
 * static静态代码块实现
 */
public class Singleton5 {

    // 私有构造
    private Singleton5() {}

    private static Singleton5 singleton = null;

    // 静态代码块
    static {
        singleton = new Singleton5();
    }

    public static Singleton5 getInstance() {
        return singleton;
    }
}
