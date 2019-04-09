package top.zz;
/**
 * Banner 类，作为 Adaptee，实现了最初的方法。
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
