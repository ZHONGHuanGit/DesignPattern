public class Singleton
{
	private static Singleton singleton = new Singleton();//类加载了便初始化该单例对象
														//之所以称之为饿汉式，因为他太急了
	private Singleton()
	{
	}
	public static Singleton getInstance()
	{
		return singleton;
	}
}
