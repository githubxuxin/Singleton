package cn.mln521;

/**
 * 懒汉式单例（延迟加载方式）
 * 但在多线程环境下会产生多个single对象
 * 改造使用synchronized同步锁
 */
public class Singleton2 {
    //私有构造
    private Singleton2() {}

    private static Singleton2 singleton = null;

    public static Singleton2 getInstance() {
        if (singleton == null) {
            singleton = new Singleton2();
        }
        return singleton;
    }
}
