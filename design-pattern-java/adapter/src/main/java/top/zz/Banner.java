package top.zz;
/**
 * Banner �࣬��Ϊ Adaptee��ʵ��������ķ�����
 *
 */
public class Banner {
    private String string;

    public Banner(String string) {
        this.string = string;
    }
    public void showWithPattern() {
        System.out.println("(" + string + ")");
    }

    public void showWithStar() {
        System.out.println("*" + string + "*");
    }
}
