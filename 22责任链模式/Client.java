abstract class Handler { //抽象处理者(Handler)角色
    
    protected Handler successor;//这里是传递给后继的对象
    
    public abstract void handleRequest(); //处理请求的抽象方法，形式并不一定要这样
   
   //getter和setter
    public Handler getSuccessor() { 
        return successor;
    }
   
    public void setSuccessor(Handler successor) {
        this.successor = successor;
    }
    
}

class ConcreteHandler extends Handler { //具体处理者(ConcreteHandler)角色：
   
    //具体的处理方法
    public void handleRequest() {
    
        if(getSuccessor() == null)//判断是否有后继的责任对象,没有则自己处理，有则传出去。
        {          
			System.out.println("让我来接着吧");      
        }else
        {            
            System.out.println("交给下人办吧");
            getSuccessor().handleRequest();      
        }
    }
}

public class Client {

    public static void main(String[] args) {
        Handler h1 = new ConcreteHandler();
        Handler h2 = new ConcreteHandler();
		Handler h3 = new ConcreteHandler();
        h1.setSuccessor(h2);
		h2.setSuccessor(h3);
        h1.handleRequest();
    }

}