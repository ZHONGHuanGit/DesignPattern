//产品族1
interface AbstractProduct1{}

class Product11 implements AbstractProduct1{
	public Product11(){
		System.out.println("生产了产品11");
	}
}
class Product12 implements AbstractProduct1{
	public Product12(){
		System.out.println("生产了产品12");
	}
}
//产品族2
interface AbstractProduct2{}

class Product21 implements AbstractProduct2{
	public Product21(){
		System.out.println("生产了产品21");
	}
}
class Product22 implements AbstractProduct2{
	public Product22(){
		System.out.println("生产了产品22");
	}
}

interface AbstractFactory{
	AbstractProduct1 createP1();//生产产品族1的产品
	AbstractProduct2 createP2();//生产产品族2的产品
}
//具体工厂1，由具体工厂1自己决定生产每个产品族的哪一个产品
class Factory1 implements AbstractFactory{
	public AbstractProduct1 createP1(){
		return new Product11();
	}
	public AbstractProduct2 createP2(){
		return new Product21();
	}
}
//具体工厂2，由具体工厂2自己决定生产每个产品族的哪一个产品
class Factory2 implements AbstractFactory{
	public AbstractProduct1 createP1(){
		return new Product12();
	}
	public AbstractProduct2 createP2(){
		return new Product22();
	}
}

