class ModuleA {
    //示意方法
    public void doFirst(){
        System.out.println("完成第一步");
    }
}

class ModuleB {
    //示意方法
    public void doSecond(){
        System.out.println("KO第二步");
    }
}

class ModuleC{
	public void doThird(){
		System.out.println("第三步，杀了");
	}
}
//门面类角色
class Facade {
    //示意方法，满足客户端需要的功能
    public void doSth(){
        ModuleA a = new ModuleA();
        a.doFirst();
        ModuleB b = new ModuleB();
        b.doSecond();
        ModuleC c = new ModuleC();
        c.doThird();
		System.out.println("测试结束");
    }
}
//客户端角色
public class Client{
	public static void  main(String[] args){
		Facade tem = new Facade();
		tem.doSth();
	}
}