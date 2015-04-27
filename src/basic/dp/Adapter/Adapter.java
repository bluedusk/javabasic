package basic.dp.Adapter;

import com.sun.tools.javac.comp.Todo;
import com.sun.xml.internal.bind.v2.TODO;

/**
 * Created by openworld on 15-4-17.
 * 类的Adapter模式：继承Adaptee
 */
class Adapter extends Adaptee implements TargetInterface{

    @Override
    public void method2() {
        System.out.println("this is the adaptered method!");
    }
}

/**
 * 对象的Adapter模式：不集成Adapee, 类中引用
 */
class Adapter2 implements TargetInterface{

    private Adaptee adaptee;

    Adapter2() {
        adaptee = new Adaptee();
    }
    @Override
    public void method1() {
        adaptee.method1();
    }

    @Override
    public void method2() {
        System.out.println("this is the adaptered method!");
    }
}

/**
 * 接口的Adapter模式
 */
class Adapter3 {
    //Todo
}
interface TargetInterface {
    /* 与原类中的方法相同 */
    public void method1();

    /* 新类的方法 */
    public void method2();
}

class Adaptee {
    public void method1() {
        System.out.println("this is original method!");
    }
}


class Test {
    public static void main(String[] args) {
        TargetInterface target = new Adapter2();
        target.method1();
        target.method2();
    }
}