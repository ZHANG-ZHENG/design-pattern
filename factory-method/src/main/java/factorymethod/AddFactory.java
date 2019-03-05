package factorymethod;

public class AddFactory implements Factory{
    public Operation createOperation() {
        System.out.println("加法运算");
        return new Add();
    }

}
