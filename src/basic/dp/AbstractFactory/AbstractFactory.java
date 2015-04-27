package basic.dp.AbstractFactory;

import org.w3c.dom.views.AbstractView;

/**
 * Created by openworld on 15-4-17.
 * 变化的层面在Factory层面，比方想新增一个品牌，那就可以增加一个FactoryC类，其他不变。
 * 产品线是一定的，只有A和B, 如果增加产品C则需要修改AbstractFactory
 * 抽象工厂考虑两个抽象维度，产品，和品牌
 */
abstract class AbstractFactory {

    public abstract AbstractProductA createProductA();
    public abstract AbstractProductB createProductB();

}


abstract class AbstractProductA {
    public abstract void doSth();
}
abstract class AbstractProductB {
    public abstract void doSth();
}

class ProductA_FA extends AbstractProductA {

    @Override
    public void doSth() {
        System.out.println("Product A created by Factory A");
    }
}
class ProductB_FA extends AbstractProductB {

    @Override
    public void doSth() {
        System.out.println("Product B created by Factory A");
    }
}

class ProductA_FB extends AbstractProductA {

    @Override
    public void doSth() {
        System.out.println("Product A created by Factory B");
    }
}
class ProductB_FB extends AbstractProductB {

    @Override
    public void doSth() {
        System.out.println("Product B created by Factory B");
    }
}

class FactoryA extends AbstractFactory{

    @Override
    public AbstractProductA createProductA() {
        return new ProductA_FA();
    }

    @Override
    public AbstractProductB createProductB() {
        return new ProductB_FA();
    }
}

class FactoryB extends AbstractFactory{

    @Override
    public AbstractProductA createProductA() {
        return new ProductA_FB();
    }

    @Override
    public AbstractProductB createProductB() {
        return new ProductB_FB();
    }

}
class AbstractFactoryTest {


    public static void main(String[] args) {

        AbstractFactory factorya = new FactoryA();
        factorya.createProductA().doSth();
        factorya.createProductB().doSth();


        AbstractFactory factoryb = new FactoryB();
        factoryb.createProductA().doSth();
        factoryb.createProductB().doSth();

        //call factory c if needed
    }
}

