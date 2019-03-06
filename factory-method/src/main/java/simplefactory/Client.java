package simplefactory;

public class Client {
    public static void main(String[] args) throws Exception {

        Operation addOperation = SimpleFactory.createOperation("+");
        Operation subOperation = SimpleFactory.createOperation("-");


        System.out.println(addOperation.getResult(1, 1));
        System.out.println(subOperation.getResult(1, 1));

    }
}
