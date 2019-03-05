package factorymethod;

public class SubFactory implements Factory{

    public Operation createOperation() {
        System.out.println("减法运算");
        return new Sub();
    }
}