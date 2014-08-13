abstract class Furniture
{
	abstract void turnOn();

	abstract void turnOff();
}

class TV extends Furniture
{
	void turnOn()
	{
		System.out.println("电视打开了");
	}

	void turnOff()
	{
		System.out.println("电视关闭了");
	}
}

class Computer extends Furniture
{
	void turnOn()
	{
		System.out.println("电脑打开了");
	}

	void turnOff()
	{
		System.out.println("电脑关闭了");
	}
}

class Light extends Furniture
{
	void turnOn()
	{
		System.out.println("电灯打开了");
	}

	void turnOff()
	{
		System.out.println("电灯关闭了");
	}
}

abstract class OnOff
{ // 抽象开关类
	Furniture fur;

	abstract void turnOn();

	abstract void turnOff();

	void set(Furniture fur)
	{
		this.fur = fur;
	}
}

// 手机开关
class SmartPhone extends OnOff
{
	void turnOn()
	{
		fur.turnOn();
		System.out.println("用手机开的");
	}

	void turnOff()
	{
		fur.turnOff();
		System.out.println("用手机关的");
	}
}

// 电视开关
class TVOnOFF extends OnOff
{
	void turnOn()
	{
		fur.turnOn();
		System.out.println("用电视上的按钮开的");
	}

	void turnOff()
	{
		fur.turnOff();
		System.out.println("用电视上的按钮关的");
	}
}

// 电脑开关
class ComputerOnOff extends OnOff
{
	void turnOn()
	{
		fur.turnOn();
		System.out.println("用电脑按钮开的");
	}

	void turnOff()
	{
		fur.turnOff();
		System.out.println("用电脑按钮关的");
	}
}

// 电灯开关
class LightOnOff extends OnOff
{
	void turnOn()
	{
		fur.turnOn();
		System.out.println("用电灯按钮开的");
	}

	void turnOff()
	{
		fur.turnOff();
		System.out.println("用电灯按钮关的");
	}
}
