package top.zz;

public class Coffee extends Drink {
	 
	@Override
	public float cost() { //在实现是直接返回价格即可，因为单品就单品一个，实现简单

		return super.getPrice();
	}
 
	
}