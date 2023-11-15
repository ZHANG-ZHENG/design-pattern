package top.zz;

public abstract class Drink {
	public String description=""; //这个描述具体扩展出是什么单品或调料
	private float price=0f;; //这里是具体的单品或调料的价格
	
	
	public void setDescription(String description)
	{
		this.description=description;
	}
	
	public String getDescription()
	{
		return description+"-"+this.getPrice();
	}
	public float getPrice()
	{
		return price;
	}
	public void setPrice(float price)
	{
		this.price=price;
	}
	public abstract float cost();  //这个是用抽象是因为，在单品种直接返回价格即可，
	//但在调料中，调料是不能单独存在的,是跟着实体，具体实体一起的，价格不仅是调料还有单品的价格，调料cost方法是是要递归去获取所有调料的价格
	
}
