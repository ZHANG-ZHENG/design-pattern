package demo;
/**
 * 将公共方法给抽象
 * @author zz
 *
 */
public abstract class IgoChessman {
	//共享抽象方法棋子的颜色
	public abstract String chessColor();
	
	public void display() {
		System.out.println("棋子:"+this.chessColor());
	}
}