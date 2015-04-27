package basic.dp.Singleton;

/**
 * Created by openworld on 15-4-17.
 * singleton basic
 *这个版本的主要问题，就是线程安全的问题，当2个请求同时方式这个类的实例的时候，
 * 可以会在同一时间点上都创建一个实例，虽然一般不会出异常错误，
 * 但是起码不是我们谈论的只保证一个实例了。
 */

final class Singleton {

    //private
    private static Singleton instance;

    //private
    private Singleton()
    {
        System.out.println("instance create");
    }

    public static Singleton getInstance() {
        if (instance == null){
            instance = new Singleton();
        }
        return instance;
    }
}

/**
 * 实例化的时间
 */
final class Singleton2 {
    //private
    private final static Singleton2 instance = new Singleton2();

    //private
    private Singleton2()
    {
        System.out.println("instance2 create");
    }

    public static Singleton2 getInstance(){

        return instance;
    }

}

/**
 * 线程安全
 */
class Singleton3 {

    //private
    private static Singleton3 instance = null;

    //private
    private Singleton3()
    {
        System.out.println("instance3 create");
    }

    public static synchronized Singleton3 getInstance() {

        if (instance == null) {
            instance = new Singleton3();
        }
        return instance;
    }
}


/**
 * 线程安全
 * 双重检测，比3效率提高
 * 可能还是有错误
 * http://blog.csdn.net/zhangerqing/article/details/8194653
 */
class Singleton4 {

    //private
    private static Singleton4 instance = null;

    //private
    private Singleton4()
    {
        System.out.println("instance3 create");
    }

    public static Singleton4 getInstance() {

        if (instance == null) {
            synchronized (instance) {
                instance = new Singleton4();
            }
        }
        return instance;
    }
}


class SingletonTest {

    public static void main(String[] args) {

        Singleton.getInstance();
        Singleton2.getInstance();

    }
}
