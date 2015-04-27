package basic.dp.Strategy;

/**
 * 策略模式定义了一系列算法，并将每个算法封装起来，使他们可以相互替换，且算法的变化不会影响到使用算法的客户。
 * 策略模式多用在算法决策系统中，外部用户只需要决定用哪个算法即可。
 */
abstract class Strategy {
    public abstract void AlgorithmInterface();
}

class ConcreteStrategyA extends Strategy{

    @Override
    public void AlgorithmInterface() {
        System.out.println("ConcreteStrategyA AlgorithmInterface");
    }
}

class ConcreteStrategyB extends Strategy{

    @Override
    public void AlgorithmInterface() {
        System.out.println("ConcreteStrategyB AlgorithmInterface");
    }
}

class ConcreteStrategyC extends Strategy{

    @Override
    public void AlgorithmInterface() {
        System.out.println("ConcreteStrategyC AlgorithmInterface");
    }
}

class Context{

    Strategy strategy;

    Context(Strategy strategy) {
        this.strategy = strategy;
    }
    //使用不同算法计算
    public void ContextInterface() {
        this.strategy.AlgorithmInterface();
    }

}

class Test{

    public static void main(String[] args) {

        Strategy strategya = new ConcreteStrategyA();
        Strategy strategyb = new ConcreteStrategyB();

        Context c = new Context(strategya);
        c.ContextInterface();

        c = new Context(strategyb);
        c.ContextInterface();
    }
}