class cai{//抽象产品--菜
	
}

class doufu extends cai{//假设这个就是--麻婆豆腐菜，
	public doufu(){
		System.out.println("麻婆豆腐做好了");
	}
}

class jiding extends cai{ //假设这个就是--宫保鸡丁。
	public jiding(){
		System.out.println("宫保鸡丁做好了");
	}
}

class dongpo extends cai{//假设这个就是--东坡肉
	public dongpo(){
		System.out.println("东坡肉做好了");
	}
}

class Factory{
	//通过传进来的参数str，来决定生产什么产品
	public cai create(String str){
		if(str.equals("doufu"))//如果要做麻婆豆腐
			return new doufu();
		if(str.equals("jiding"))//如果要做宫保鸡丁
			return new jiding();
		if(str.equals("dongpo"))//如果要做东坡肉
			return new dongpo();
		return null;
	}
}

public class Main{
	public static void main(String[] args){
		Factory fac=new Factory();
		doufu a=(doufu)fac.create("doufu");//返回麻婆豆腐
		jiding b=(jiding)fac.create("jiding");//返回宫保鸡丁
		dongpo c=(dongpo)fac.create("dongpo");//返回东坡肉
	}
}