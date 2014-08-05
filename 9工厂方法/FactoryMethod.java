interface AbstractProduct {  
}  
//具体产品1
class Product1 implements AbstractProduct {  
    public Product1(){
    	System.out.println("生产具体产品1");
    }
} 
//具体产品2
class Product2 implements AbstractProduct{
	public Product2(){
		System.out.println("生产具体产品2");
	}
}

//抽象工厂,具体的实现交给实现该接口的具体工厂类去完成，
interface AbstractFactory {  
    public AbstractProduct create();  
}  
//具体工厂类1，主要生产具体产品1
class Factory1 implements AbstractFactory {  
    public AbstractProduct create() {  
        return new Product1();  
    }  
}  
//具体工厂类2，主要生产具体产品2
class Factory2 implements AbstractFactory {  
    public AbstractProduct create() {  
        return new Product2();  
    }  
}  
  
public class Main {  
    public static void main(String[] args) {  
        AbstractFactory factory = new Factory1();  
        Product1 prodect1 = (Product1)factory.create();//生产了具体产品1
        
        factory = new Factory2();
        Product2 prodect2 = (Product2)factory.create();//生产了具体产品2
    }  
}  
