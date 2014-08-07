interface Prototype extends Cloneable {//实现cloneable接口
	public Prototype clone();//交给具体的原型子类去实现
}

class ConcretePrototype implements Prototype{
	public Prototype clone(){//子类实现自己的clone方法
		Prototype prototype = null;  
        try{  
            prototype = (Prototype)super.clone();  
        }catch(CloneNotSupportedException e){  
            e.printStackTrace();  
        }  
        System.out.println("成功得到一个原型复制品");
        return prototype;   
	}
}

class Client{
	Prototype prototype=new ConcretePrototype();
	void getPrototype(){
		Prototype pt=prototype.clone();//通过原型，得到一个新的原型
	}
}

public class Main{
	public static void main(String[] args){
		new Client().getPrototype();
	}
}
