public class Singleton
{
	private static Singleton instance = null;

	private Singleton()
	{
		// dosomething
	}

	public static Singleton getInstance()
	{
		if (instance == null)
		{
			synchronized (Singleton.class)//可以思考一下，为什么这样提高效率
			{
				if (null == instance)
				{
					instance = new Singleton();
				}
			}
		}
		return instance;
	}
}
/*
 Double check 的写法：
	1 第一个条件是说，如果实例创建了，那就不需要同步了，直接返回就好了。
	2 不然，我们就开始同步线程。
	3 第二个条件是说，如果被同步的线程中，有一个线程创建了对象，那么别的线程就不用再创建了。

*/
