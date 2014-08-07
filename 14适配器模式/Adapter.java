interface Duck{
	public void quack();//鸭子呱呱叫
	public void fly();//鸭子会飞
}

class MallardDuck implements Duck{
	public void quack(){
		System.out.println("鸭子呱呱叫");
	}
	public void fly(){
		System.out.println("我是绿头鸭，我正在飞翔");
	}
}

interface Turkey{
	public void gobble();
	public void fly();
}

class WildTurkey implements Turkey{
	public void gobble(){
		System.out.println("火鸡咯咯叫");
	}
	public void fly(){
		System.out.println("我是火鸡，我正在飞，可是飞不远");
	}
}

class TurkeyAdapter implements Duck{
	Turkey turkey;//这个就是要充数的火鸡
	public TurkeyAdapter(Turkey turkey){
		this.turkey=turkey;//初始化时，告诉适配器，要冒充的火鸡
	}
	public void quack(){
		turkey.gobble();//火鸡不会呱呱叫，只好用咯咯叫来顶替了
	}

	public void fly(){
		for(int i=0;i<5;i++){
			turkey.fly();//火鸡飞得不远，所以多飞几次来顶替。
		}
	}
}

public class Main{
	public static void main(String[] args){
		WildTurkey turkey=new WildTurkey();//先创建一只火鸡
		Duck turkeyAdapter = new TurkeyAdapter(turkey);//用适配器来包装这个火鸡
		//这个适配器就好像一个鸭子一样，会quack，会fly
		turkeyAdapter.quack();
		turkeyAdapter.fly();
	}
}