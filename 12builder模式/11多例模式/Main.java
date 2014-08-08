//苹果产品族
interface Apple{}
class Iphone implements Apple{//苹果手机
         public Iphone(){
                   System.out.println("生产了iphone");
         }
}
class Ipad implements Apple{//苹果pad
         publicIpad(){
                   System.out.println("生产了ipad");
         }
}
 
//三星产品族
interface SamSung{}
class SanSungPhone implements SamSung{//三星手机
         public SanSungPhone(){
                   System.out.println("生产了三星手机");
         }
}
class SamSungPad implements SamSung{//三星平板
         public SamSungPad(){
                   System.out.println("生产了三星平板电脑");
         }
}
//富士康工厂抽象接口
interface FuShiKang{
         Apple createApple();//生产苹果产品族的产品
         SamSung createSamSung();//生产三星产品族的产品
}
//富士康专门生产手机的工厂
class PhoneFactory implements FuShiKang{
         public Apple createApple(){//生产苹果手机
                   return new Iphone();
         }
         public SamSung createSamSung(){//生产三星手机
                   return new SanSungPhone();
         }
}
//富士康专门生产平板电脑的工厂
class PadFactory implements FuShiKang{
         public Apple createApple(){//生产苹果的ipad
                   return new Ipad();
         }
         public SamSung createSamSung(){//生产三星的平板
                   return new SamSungPad();
         }
}
 
public class Main{
         public static void main(String[] args){
      //订购商来到富士康，要订购一台iphone,所以负责人告诉生产手机的工厂加工生产
                   FuShiKang factory=new PhoneFactory();
                   Apple iphone= factory.createApple();
                  
                   //然后要一些三星平板电脑，所以负责人告诉生产平板电脑的工厂加工生产
                   factory=newPadFactory();
                   SamSung samsungPad= factory.createSamSung();
         }       
}