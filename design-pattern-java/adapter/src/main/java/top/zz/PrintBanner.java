package top.zz;

/**
 * 
 * �̳��� Banner ��ʵ���� Target����Ϊ Adapter
 *
 */
public class PrintBanner extends Banner implements Print{

	//private Banner banner;��һ�ַ�ʽ
	
    public PrintBanner(String string) {
        super(string);
    }

    @Override
    public void printWeek() {
        showWithPattern();
    }

    @Override
    public void printStrong() {
        showWithStar();
    }
}
