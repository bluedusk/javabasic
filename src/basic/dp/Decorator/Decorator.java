package basic.dp.Decorator;

/**
 * Decorator模式：
 * 为已有的功能动态的添加更多功能
 */


/**
 * Decorator类
 */
abstract class Decorator extends Component {

    protected Component component;

    public void SetComponent(Component component) {
        this.component = component;
    }

    @Override
    public void Operation() {
        if (component == null) {
            component.Operation();
        }
    }
}

class ConcreteDecoratorA extends Decorator {

    private String addedState; //A的特有为了区分B

    public void Operation() {
        super.Operation();
        addedState = "New State";
        System.out.println("ConcreteDecoratorA Operation");
    }
}

class ConcreteDecoratorB extends Decorator {

    public void Operation() {
        super.Operation();
        AddedBehavior();
        System.out.println("ConcreteDecoratorB Operation");
    }

    private void AddedBehavior() {
        //B特有为了区分
    }
}

/**
 * 需要被动态扩展功能的类抽象类
 */
abstract class Component {
    public abstract void Operation();
}

/**
 * 需要被动态扩展功能的实体类
 */
class ConcreteComponent extends Component {

    @Override
    public void Operation() {
        System.out.println("ConcreteComponent Operation");
    }
}


class Test {

    public static void main(String[] args) {

        ConcreteComponent c = new ConcreteComponent();
        ConcreteDecoratorA d1 = new ConcreteDecoratorA();
        ConcreteDecoratorB d2 = new ConcreteDecoratorB();

        d1.SetComponent(c);
        d2.SetComponent(c);
        d2.Operation();

    }





}