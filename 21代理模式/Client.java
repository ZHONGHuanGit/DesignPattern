
abstract class Subject{
	/**
	 * 抽象的请求方法
	 */
	abstract public void request();
}

class RealSubject extends Subject{
	public RealSubject(){}
	
	//实现请求方法，这里是接收苹果
	public void request(){
		System.out.println("老班长是好人，会送苹果，^_^，在下接受了");
	}
}

class Proxy extends Subject{
	
	Subject realSubject;
	
	public Proxy(Subject realSubject){
		this.realSubject=realSubject;
	}
	
	public void preRequest(){
		System.out.println("准备工作完毕");
	}
	
	public void request(){
		System.out.println("我是送苹果结构，除夕夜替人送苹果");
		this.preRequest();
		realSubject.request();
		this.postRequest();
		System.out.println("送完了");
	}
	
	public void postRequest(){
		System.out.println("收尾工作结束");
	}
}

public class Client{
	public static void main(String[] args)
	{
		Subject realSubject=new RealSubject();
		Proxy proxy = new Proxy(realSubject);
		proxy.request();
	}
}