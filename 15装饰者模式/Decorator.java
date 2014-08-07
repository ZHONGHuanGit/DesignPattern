interface Beverage{
	String description = "unknown beverage";
	public String getDescription();//返回描述的
	public double cost();//返回价格的
}

class CoffeeBean1 implements Beverage{
	String description = "选了咖啡豆1：";
	public String getDescription(){
		return description;
	}
	public double cost(){
		return 30;//基本价格30元
	}
}

class CoffeeBean2 implements Beverage{
	String description = "选了咖啡豆2:";
	public String getDescription(){
		return description;
	}
	public double cost(){
		return 28;//基本价格28元
	}
}

class Decorator implements Beverage{
	String description = "unknown 装饰";
	Beverage beverage;
	public String getDescription(){
		return description;
	}
	public double cost(){
		return 0;//由子类来决定具体的装饰价格
	}
}

class Milk extends Decorator{
	String description = "加了牛奶";
	public Milk(Beverage beverage){
		this.beverage=beverage;
	}
	public String getDescription(){
		return beverage.getDescription()+"\n"+description;//还有被装饰者的描述
	}
	public double cost(){
		return 5+beverage.cost();//加牛奶的价格是5元,还得加上里面beverage的价格
	}
}
class Soy extends Decorator{
	String description = "加了豆浆";
	public Soy(Beverage beverage){
		this.beverage=beverage;
	}
	public String getDescription(){
		return beverage.getDescription()+"\n"+description;//还有被装饰者的描述
	}
	public double cost(){
		return 4+beverage.cost();//加豆浆的价格是4元,还得加上里面beverage的价格
	}
}
class Mocha extends Decorator{
	String description = "加了摩卡";
	public Mocha(Beverage beverage){
		this.beverage=beverage;
	}
	public String getDescription(){
		return  beverage.getDescription()+"\n"+description;//还有被装饰者的描述
	}
	public double cost(){
		return 6+beverage.cost();//加摩卡的价格是6元,还得加上里面beverage的价格
	}
}

public class Main{
	public static void main(String[] args){
		Beverage coffee=new CoffeeBean1();//一开始选了咖啡豆1
		coffee=new Mocha(coffee);//加了摩卡
		coffee=new Milk(coffee);//加了牛奶
		System.out.println(coffee.getDescription());
		System.out.println("咖啡的价格为:"+coffee.cost());
	}
}


