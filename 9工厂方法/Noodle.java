interface InstantNoodle{
	void addOil();//意思是加油
	void addPeiLiao();//意思是加配料,原谅我用汉字拼音表示
}

class HaiXian implements InstantNoodle{//意思是海鲜面
	public HaiXian(){
		System.out.println("拆了一包海鲜面");
	}
	public void addOil(){
		System.out.println("加了点油");
	}
	public void addPeiLiao(){
		System.out.println("加了点海鲜风味的配料");
	}
}

class HongShao implements InstantNoodle{//意思是红烧面
	public HongShao(){
		System.out.println("拆了一包红烧面");
	}
	public void addOil(){
		System.out.println("加了点油，红烧面的油味道比较重哦！");
	}
	public void addPeiLiao(){
		System.out.println("经典的红烧面配料");
	}
}

public class Main{
	public static void main(String[] args){
		//假设现在肚子饿了，开始做面
		System.out.println("我要开始做红烧面了");
		InstantNoodle noodle1=new HongShao();
		noodle1.addOil();
		noodle1.addPeiLiao();
		System.out.println("面做完了");
		System.out.println("-----------------------------------------------");
		
		//另外一个人想要吃海鲜面
		System.out.println("我要开始做海鲜面了");
		InstantNoodle noodle2=new HaiXian();
		noodle2.addOil();
		noodle2.addPeiLiao();
		System.out.println("面做完了");
		System.out.println("-----------------------------------------------");
		
	}
}
