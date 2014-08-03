class Person{
	public String name;
}
class GodFather{
	CoreMember coremember;
	public void kill(Person someone)
	{
		Killer killer = new Killer();
		killer.kill(someone);
	}
}

class CoreMember{
	private Killer killer;
}

class Killer{
	public void kill(Person someone)
	{
		System.out.println(someone.name+" ±ª…±À¿¡À");
	}
}