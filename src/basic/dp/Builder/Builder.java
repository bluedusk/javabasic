package basic.dp.Builder;

import com.sun.xml.internal.bind.v2.model.core.BuiltinLeafInfo;

/**
 * Created by openworld on 15-4-17.
 * 分步骤创建对象
 */
public class Builder extends AbstractBuilder {
    @Override
    public void BuildPartA() {
        System.out.println("Build PartA");
    }

    @Override
    public void BuildPartB() {
        System.out.println("Build PartB");
    }

    @Override
    public void BuildPartC() {
        System.out.println("Build PartB");
    }
}

abstract class AbstractBuilder {
    public abstract void BuildPartA();
    public abstract void BuildPartB();
    public abstract void BuildPartC();
}

class Director {
    public void Construct(AbstractBuilder abstractBuilder) {
        abstractBuilder.BuildPartA();
        abstractBuilder.BuildPartB();
        abstractBuilder.BuildPartC();
    }
}
class Test {
    public static void main(String[] args) {

        Builder builder = new Builder();
        Director director = new Director();
        director.Construct(builder);

    }
}