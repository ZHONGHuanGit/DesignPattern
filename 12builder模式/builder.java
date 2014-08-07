import java.util.ArrayList;
//假设产品是一份计划
class Plan{
	public ArrayList<String> list = new ArrayList<String>();
	void add(String str){
		list.add(str);
		System.out.println("将\""+str+"\"加入计划");
	}
	void Out(){//打印出计划的内容
		System.out.println("计划内容如下:");
		for(String tmp:list){
	         System.out.println(tmp);
	    }
	}
}

interface AbstractBuilder{
	void addRollerCoaster();//将过山车加入计划
	void addFerrisWheel();//将摩天轮加入计划
	void addPirateShip();//将海盗船加入计划
	Plan retrievePlan();//返回计划
}

class ConcreteBuilder implements AbstractBuilder{
	Plan plan = new Plan();
	public void addRollerCoaster(){//将过山车加入计划
		plan.add("roller coaster");
	}
	public void addFerrisWheel(){//将摩天轮加入计划
		plan.add("ferris wheel");
	}
	public void addPirateShip(){//将海盗船加入计划
		plan.add("pirate ship");
	}
	public Plan retrievePlan()//返回计划
	{
		return plan;
	}
}

class Director{
	public void construct(){
		AbstractBuilder builder=new ConcreteBuilder();
		builder.addRollerCoaster();
		builder.addFerrisWheel();
		builder.addPirateShip();
		builder.addRollerCoaster();//玩第二次
		//构建完毕后，我们就得到了我们的计划
		Plan plan=builder.retrievePlan();
		plan.Out();//打印出计划的内容
	}
}

public class builder{
	public static void main(String[] args){
		Director dir=new Director();
		dir.construct();
	}
}

