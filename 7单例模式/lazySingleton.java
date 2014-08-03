public class Singleton
{
	private static Singleton singleton;

	private Singleton()
	{
	}
	//注意这里synchronized，保证了线程安全,意思就是每次只有一个线程能够访问该方法
	public static synchronized Singleton getInstance()
	{
		if (singleton == null) 
		{//当singleton要用的时候才初始化，加判断避免重复初始化，保证只new了一次
			singleton = new Singleton();
		}
		return singleton;
	}
}
