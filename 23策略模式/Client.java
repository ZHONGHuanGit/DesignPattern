interface Strategy{
	public double cost(double money); //根据传进去的价格，返回一个确切的价格，因为最终价格会根据情况来定嘛
}

class PuTong implements Strategy{//原谅我直接上中文拼音了

	@Override
	public double cost(double money)
	{
		return money*0.8;//普通会员打8折
	}
	
}

class Super implements Strategy{

	@Override
	public double cost(double money)
	{
		
		return money*0.6; //黄金会员嘛，打6折
	}
	
}

public class Client{
	public static void main(String[] args)
	{
		Strategy strategy = new Super();//土豪用的是超级会员卡
		System.out.println("原价100的理发，打完折要付："+strategy.cost(100)); //土豪理发100会不会便宜点嘿嘿
		
		strategy = new PuTong();
		System.out.println("原价30的理发，打完折要付: "+strategy.cost(30)); //普通卡理发就这价，差距在哪里，哎~~
	}
}

