package basic.dp.Proxy;

/**
 * Proxy模式
 *
 */


/**
 * 定义了RealSubject和Proxy的公共接口
 */
abstract class Subject {
    public abstract void Request();
}

class RealSubject extends Subject {

    @Override
    public void Request() {
        System.out.println("RealSubject Request");
    }
}

class Proxy extends Subject{

    RealSubject realSubject;

    @Override
    public void Request() {
        if (realSubject == null) {
            realSubject = new RealSubject();
        }
        before();
        realSubject.Request();
        after();
    }
    //proxy的增值服务
    private void after() {
        System.out.println("after proxy!");
    }
    private void before() {
        System.out.println("before proxy!");
    }
}

class Test {

    public static void main(String[] args) {
        Proxy proxy = new Proxy();
        proxy.Request();
    }
}


