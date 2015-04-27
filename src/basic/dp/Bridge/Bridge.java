package basic.dp.Bridge;

/**
 * Bridge Pattern:
 * 将抽象化与实现化解耦，使得二者可以独立变化
 * 如JDBC连接
 * 大话设计模式：手机软件和手机品牌的例子
 */
public class Bridge {
}

abstract class Implementor {
    public abstract void Operation();
}

class ConcreteImplA extends Implementor {

    @Override
    public void Operation() {
        System.out.println("ConcreteImplA Operation");
    }
}

class ConcreteImplB extends Implementor {

    @Override
    public void Operation() {
        System.out.println("ConcreteImplB Operation");
    }
}

/**
 * 桥，动态的设定implementor
 */
class Abstraction {

    protected Implementor implementor;

    public void SetImpl(Implementor implementor) {
        this.implementor = implementor;
    }

    public void Operation() {
        implementor.Operation();
    }

}

class RefinedAbstration extends Abstraction{

    @Override
    public void Operation() {
        implementor.Operation();
    }
}

class Test{
    public static void main(String[] args) {
        Abstraction ab = new Abstraction();

        ab.SetImpl(new ConcreteImplA());
        ab.Operation();

        ab.SetImpl(new ConcreteImplB());
        ab.Operation();
    }
}

