package cn.mln521;

/**
 * 使用双重检查进一步做了优化，可以避免整个方法被锁，
 * 只对需要锁的代码部分加锁，可以提高执行效率
 */
public class Singleton4 {
    // 私有构造
    private Singleton4() {}

    private static Singleton4 singleton = null;

    // 双重检查
    public static Singleton4 getInstance() {
        if (singleton == null) {
            synchronized (Singleton4.class) {
                if (singleton == null) {
                    singleton = new Singleton4();
                }
            }
        }
        return singleton;
    }
}
