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

class Factory{
	public InstantNoodle create(String str){
		InstantNoodle noodle=null;
		if(str.equals("HaiXian")){
			System.out.println("我要开始做红烧面了");
			noodle=new HongShao();
			noodle.addOil();
			noodle.addPeiLiao();
			System.out.println("面做完了");		
		}
		if(str.equals("HongShao")){
			System.out.println("我要开始做海鲜面了");
			noodle=new HaiXian();
			noodle.addOil();
			noodle.addPeiLiao();
			System.out.println("面做完了");
		}
		System.out.println("-----------------------------------------------");
		return noodle;
	}
}

public class Main{
	public static void main(String[] args){
		Factory fac=new Factory();
		//假设现在肚子饿了，开始做面,第一个人想吃海鲜面
		InstantNoodle noodle1=fac.create("HaiXian");
		
		//另外一个人想要吃海鲜面
		InstantNoodle noodle2=fac.create("HongShao");
		
	}
}
