import java.util.ArrayList;

abstract class Component
{
    protected String name; //这个用来标示一下节点
    public Component(String name)
    {
        this.name = name;
    }
 
    public abstract void add(Component c);//增加儿子节点
    public abstract void remove(Component c);//删除儿子节点
}

class Leaf extends Component
{
    public Leaf(String name)
    {
       super(name);
    }
 
    public  void add(Component c)
    {
       System.out.println("叶子节点不能增加子节点");
    }
 
    public void remove(Component c)
    {
    	System.out.println("叶子节点没有子节点，移除神马");
    }
}

class Composite extends Component
{
 
    ArrayList<Component> child;
 
    public Composite(String name)
    {
    	super(name);
        if (child == null)
        {
            child = new ArrayList<Component>();
        }
    }
 
    public void add(Component c)
    {
        this.child.add(c);
    }
 
    public void remove(Component c)
    {
        this.child.remove(c);
    }
}

public class Client{
	public static void main(String[] args)
	{
		Component tree=new Composite("A");//根节点一般是composite节点，给根节点取名A
		Component leafB=new Leaf("B");//创建了一个叶子节点B
		tree.add(leafB);//根节点有一个叶子节点儿子
		
		Component branchC=new Composite("C");//一个树枝节点C
		tree.add(branchC);//树枝节点C是根节点A的子节点
		
		Component leafD = new Leaf("D");
		branchC.add(leafD);//树枝节点C有一个叶子子节点D
		
		//树结构大致构造完毕
	}
}