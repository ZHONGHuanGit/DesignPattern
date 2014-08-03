class Person{
	public String name;
}
class GodFather{
	CoreMember coremember;
	public void kill(Person someone)
	{
		coremember.kill(someone);
	}
}

class CoreMember{
	private Killer killer;
	public void kill(Person someone)
	{
		killer.kill(someone);
	}
}

class Killer{
	public void kill(Person someone)
	{
		System.out.println(someone.name+" 被杀死了");
	}
}