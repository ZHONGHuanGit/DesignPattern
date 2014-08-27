import java.util.Map;
import java.util.HashMap;
import java.util.Iterator;

//抽象享元角色
abstract class Flyweight {
	abstract public void show(String state);// 声明了一个show方法，这里用来展示字母
}

class ConcreteFlyweight extends Flyweight {
	private Character intrinsicState = null;// 内部状态

	// 构造函数，内部状态作为参数穿进去
	public ConcreteFlyweight(Character state) {
		intrinsicState = state;
	}

	// 根据外部状态来展示
	public void show(String state) {
		System.out.println("我是  " + intrinsicState + "    当前字体为：" + state);
	}
}

class FlyweightFactory {
	private HashMap<Character,Flyweight> map = new HashMap<Character,Flyweight>(); // 用来存储享元对象

	public FlyweightFactory() {
	}

	// 创建享元对象的方法，内部状态作为参数输入
	public Flyweight factory(Character state) {
		if (map.containsKey(state)) {
			return map.get(state);
		} else {
			Flyweight ft = new ConcreteFlyweight(state);
			map.put(state, ft);
			return ft;
		}
	}

	// 遍历享元
	public void checkFlyweight(){
		System.out.println("=========checkFlyweight==================");
		int i=0;
		for(Iterator it = map.entrySet().iterator();it.hasNext();i++){
			Map.Entry e = (Map.Entry)it.next();
			System.out.println("第"+i+"项是："+e.getKey());
		}
		System.out.println("=========checkFlyweight==================");
	}
}

public class Client {
	FlyweightFactory factory = new FlyweightFactory();
	
	void run(){
		Flyweight fly = factory.factory(new Character('a'));
		fly.show("宋体");// 这个a是宋体的格式
		fly = factory.factory(new Character('b'));
		fly.show("xx体");// 这个b是xx体的格式
		factory.checkFlyweight();
	}
	public static void main(String[] args) {
		new Client().run();
	}
}
