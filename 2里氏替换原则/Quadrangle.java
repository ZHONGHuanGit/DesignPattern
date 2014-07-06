
class Quadrangle{
	int length;
	int width;
	public int getLength()
	{
		return length;
	}
	public void setLength(int length)
	{
		this.length = length;
	}
	public int getWidth()
	{
		return width;
	}
	public void setWidth(int width)
	{
		this.width = width;
	}
	
}

//普通的矩形
class Rectangle extends Quadrangle
{
	
}

/*
 * 因为Square的长宽相同，用一个size来统一
 * 所以改写了父类的方法，因为它们实际上都是对size进行修改
 */
class Square extends Quadrangle{
	int size;
	public int getLength()
	{
		return size;
	}

	public void setLength(int length)
	{
		this.size = length;
	}

	public int getWidth()
	{
		return size;
	}

	public void setWidth(int width)
	{
		this.size = width;
	}

	public int getSize()
	{
		return size;
	}

	public void setSize(int size)
	{
		this.size = size;
	}
}

public class Main{

	static void testRec(Rectangle rec)
	{
		while(rec.getWidth()<=rec.getHight())
		{
			rec.setWidth(rec.getWidth());
		}
	}
	
	public static void main(String[] args)
	{
		Rectangle rec=new Square();
		rec.setWidth(5);
		rec.setLength(6);
		testRec(rec);//这里会报错
					
	}
}



