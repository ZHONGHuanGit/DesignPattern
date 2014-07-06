
/*
 * 虚拟的抢,后面的枪不管如何实现的，都必须保证，shoot这个接口，实现的就是枪的射击，不同的枪的射击方式是不一样的，但是枪的射击理论上有一个共同的步骤
 * 就是子弹出来，射向对方，具体如何我们不管，总之，子类在实现枪这个shoot这个射击方法的接口的时候，不能变成是装子弹，这个就违反了里氏替换原则了
 * 这里是关键，就是射击就是射击
 * 如果不明白为什么违反，那么请你再仔细思考下，还是不懂，留言吧。
 * 
 */
interface Gun{
	public void shoot();
}

//手枪实现Gun接口
class HandGun implements Gun{
	public void shoot()
	{
		System.out.println("手枪射击");
	}
}

//AK47实现Gun接口
class AK47 implements Gun{
	public void shoot()
	{
		System.out.println("AK47射击");
	}
}

//机枪实现Gun接口
class MachineGun implements Gun{
	public void shoot()
	{
		System.out.println("机枪在装子弹");//这里就是违反了里氏替换原则原则
	}
}

class Hero{
	String name;
	Gun gun;
	public Hero(String name)
	{
		this.name=name;
	}
	
	public void setGun(Gun gun)
	{
		this.gun=gun;
	}
	
	public Gun getGun(Gun gun)
	{
		return gun;
	}
	
	public void shoot()
	{
		if(gun==null)
		{
			System.out.println("没抢啦，快去拿把枪吧");
			return ;
		}
		gun.shoot();
	}
}


public class Main{
	public static void main(String[] args)
	{
		Hero hero=new Hero("神枪手");
		
		//给枪手配上AK47
		hero.setGun(new AK47());
		hero.shoot();
		
		//给枪手配上机枪
		hero.setGun(new MachineGun());
		hero.shoot();//本来想设计的，结果却变成了装子弹
					//这个还是属于比较明显的问题
		
		hero.setGun(new HandGun());
		hero.shoot();
	}
}










