import java.util.Random;

class Die{
	private static Die die1=new Die();//筛子1
	private static Die die2=new Die();//筛子2
	private Die(){
		//私有的构造子保证外界无法将此类实例化
	}
	//获取筛子方法，类似简单工厂模式,通过tag决定返回哪个筛子
	public static Die getDie(int tag){
		if(tag==1)
			return die1;
		if(tag==2)
			return die2;
		return null;
	}
	//掷筛子，返回一个1~6的随机数字。
	public synchronized int dice(){
		Random random=new Random();
		return random.nextInt(6)+1;
	}
}

public class Main{
	private static Die die1,die2;
	public static void main(String[] args){
		 die1 = Die.getDie(1);
		 die2 = Die.getDie(2);
		 System.out.println("筛子1的值是"+ die1.dice());
		 System.out.println("筛子2的值是"+ die2.dice());
	}
}
