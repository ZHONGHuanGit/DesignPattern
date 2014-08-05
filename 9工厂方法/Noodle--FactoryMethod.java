interface InstantNoodle
{
	void addOil();// 意思是加油

	void addPeiLiao();// 意思是加配料,原谅我用汉字拼音表示
}

class HaiXian implements InstantNoodle
{// 意思是海鲜面
	public HaiXian()
	{
		System.out.println("拆了一包海鲜面");
	}

	public void addOil()
	{
		System.out.println("加了点油");
	}

	public void addPeiLiao()
	{
		System.out.println("加了点海鲜风味的配料");
	}
}

class HongShao implements InstantNoodle
{// 意思是红烧面
	public HongShao()
	{
		System.out.println("拆了一包红烧面");
	}

	public void addOil()
	{
		System.out.println("加了点油，红烧面的油味道比较重哦！");
	}

	public void addPeiLiao()
	{
		System.out.println("经典的红烧面配料");
	}
}

interface Factory
{
	InstantNoodle create();
}

// 海鲜面制作工厂，使用先加油，后放配料做法
class HaiXianFac1 implements Factory
{
	public InstantNoodle create()
	{
		System.out.println("我要开始做海鲜面了,制作手法为先加油，后放配料");
		InstantNoodle noodle = new HaiXian();
		noodle.addOil(); // 这里是先加油，后放配料
		noodle.addPeiLiao();
		System.out.println("-----------------------------------------------");
		return noodle;
	}
}

// 海鲜面制作工厂，使用先放配料，后加油做法
class HaiXianFac2 implements Factory
{
	public InstantNoodle create()
	{
		System.out.println("我要开始做海鲜面了，使用制作手法为先放配料，后加油");
		InstantNoodle noodle = new HaiXian();
		noodle.addPeiLiao();
		noodle.addOil(); // 这里是先放配料,后加油
		System.out.println("-----------------------------------------------");
		return noodle;
	}
}

public class Main
{
	public static void main(String[] args)
	{

		// 假设现在肚子饿了，开始做面,第一个人想吃海鲜面,他喜欢先加油，后放配料
		Factory fac1 = new HaiXianFac1();
		InstantNoodle noodle1 = fac1.create();

		// 另外一个人也想要吃海鲜面,他喜欢先方配料，后加油
		Factory fac2 = new HaiXianFac2();
		InstantNoodle noodle2 = fac2.create();

	}
}
