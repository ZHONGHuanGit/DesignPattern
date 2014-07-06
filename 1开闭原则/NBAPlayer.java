import java.util.*;

//将技巧抽象为一个方法，单独拿出来
interface Skill{
public:
   void skill();
};

//詹姆斯的技巧
class JamesSkill implements SKill{
	public void JamesSkill::skill()
	{
		system.out.println("詹姆斯的技巧：战斧式扣篮");
	}
};

//科比的技巧
class KobeSkill implements SKill{
	public void JamesSkill::skill()
	{
		system.out.println("科比的技巧： 后仰跳投");
	}
};

//艾弗森的技巧
class AISkill implements SKill{
	public void JamesSkill::skill()
	{
		system.out.println("艾弗森的技巧： 变相");
	}
};


class NBAPlayer {
:
	//姓名
	private	string name;
	private Skill skill;

	public NBAPlayer(string name,Skill skill){
		this.name=name;
		this.skill=skill;
	}
	public void setSkill(Skill  skill){
		this.skill=skill;
	}
	public Skill  getSkill(){
		return skill;
	}
    public string getName(){
    	return name;
    }
    public void action(){
    	skill.skill();
    }
};

public class Main{

	public static void main(String args[])
	{
		//不同的技巧
		Skill jamesSkill=new JamesSkill();
		Skill kobeSkill=new KobeSkill();
		Skill aiSkill=new AISkill();

		//不同的球员
		NBAPlayer james=new NBAPlayer("James",jamesSkill);
		NBAPlayer kobe=new NBAPlayer("kobe",kobeSkill);
		NBAPlayer ai=new NBAPlayer("AI",aiSkill);

		//会有不同的表现
		james.action();
		kobe.action();
		ai.action();
	}

}

