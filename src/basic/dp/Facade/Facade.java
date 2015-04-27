package basic.dp.Facade;

/**
 * Created by openworld on 15-4-17.
 */

class Test {

    public static void main(String[] args) {
        Facade facade = new Facade();
        facade.MethodA();
        facade.MethodB();
    }
}

public class Facade {

    SubSystem1 one;
    SubSystem2 two;
    SubSystem3 three;
    SubSystem4 four;


    public Facade() {
        one = new SubSystem1();
        two = new SubSystem2();
        three = new SubSystem3();
        four = new SubSystem4();
    }

    public void MethodA() {
        System.out.println("MethodA -------- ");
        one.Method1();
        two.Method2();
        four.Method4();
    }
    public void MethodB() {
        System.out.println("MethodB -------- ");
        three.Method3();
        two.Method2();
        four.Method4();
    }

}

class SubSystem1 {
    public void Method1() {
        System.out.println("SubSystem1 Method1");
    }
}
class SubSystem2 {
    public void Method2() {
        System.out.println("SubSystem2 Method2");
    }
}
class SubSystem3 {
    public void Method3() {
        System.out.println("SubSystem3 Method3");
    }
}
class SubSystem4 {
    public void Method4() {
        System.out.println("SubSystem4 Method4");
    }
}