package top.zz;

public class Director {
	public Human createHumanByDirecotr(IHumanBuilder bh){
		bh.buildBody();
		bh.buildFoot();
		bh.buildHand();
		bh.buildHead();
		return bh.createHuman();
	}

}