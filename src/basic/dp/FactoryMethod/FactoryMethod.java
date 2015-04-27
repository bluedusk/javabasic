package basic.dp.FactoryMethod;

/**
 * Created by openworld on 15-4-17.
 * 变化层面在产品，增加具体产品，只需要增加ProductC类，
 * 并修改create方法增加判断。如果用反射则不需要修改FactoryMethod类了。
 */
public class FactoryMethod {

    public Product create(String type) {

        if ("A".equals(type)) {
            return new ProductA();
        } else if ("B".equals(type)) {
            return new ProductB();
        } else {
            System.out.println("Type Error!");
            return null;
        }
    }

}

abstract class Product
{

    abstract void doSth();

}

class ProductA extends Product{

    @Override
    void doSth() {
        System.out.println("doSth - ProductA");
    }
}

class ProductB extends Product{

    @Override
    void doSth() {
        System.out.println("doSth - ProductB");
    }
}