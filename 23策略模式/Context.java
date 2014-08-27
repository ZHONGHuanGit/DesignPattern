public class Context {
  
    private Strategy strategy; //具体策略的对象
	
    // 构造函数，可以传入一个具体策略对象
    public Context(Strategy strategy){
        this.strategy = strategy;
    }
   
    public void contextInterface(){
        
        strategy.strategyInterface(); //这里是Context需要使用某个策略对象的方法了
    }
    
	public void setStrategy(Strategy strategy){
		 this.strategy = strategy;
	}
	
	public Strategy getStrategy(){
		return strategy;
	}
}