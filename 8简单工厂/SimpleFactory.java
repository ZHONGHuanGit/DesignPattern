class fruit{
	
}
class apple extends fruit{
	public apple(){
		System.out.println("生产了一个苹果");
	}
}

class banana extends fruit{
	public banana(){
		System.out.println("生产了一个香蕉");
	}
}

class Factory{
	//通过传进来的参数str，来决定生产什么产品
	public fruit create(String str){
		if(str.equals("apple"))
			return new apple();
		if(str.equals("banana"))
			return new banana();
		return null;
	}
}

public class Main{
	public static void main(String[] args){
		Factory fac=new Factory();
		apple a=(apple)fac.create("apple");//传进apple，生产apple
		banana b=(banana)fac.create("banana");
	}
}