package simplefactory;

public class SimpleFactory {
    // 简单工厂，根据字符串创建相应的对象
	//而且增加、删除某个子类对象的创建都需要打开简单工厂类来进行修改代码也违反了开-闭原则
    public static Operation createOperation(String name) {
        Operation operationObj = null;
        switch (name) {
            case "+":
                operationObj = new Add();
                break;
            case "-":
                operationObj = new Sub();
                break;

        }
        return operationObj;
    }
}
