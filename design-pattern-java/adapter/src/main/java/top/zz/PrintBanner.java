package top.zz;

/**
 * 
 * 继承了 Banner 和实现了 Target，作为 Adapter
 *
 */
public class PrintBanner extends Banner implements Print{

	//private Banner banner;另一种方式
	
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
