//普通的矩形
class Rectangle
{
	int length, width;
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

	public int getHight()
	{
		// TODO Auto-generated method stub
		return 0;
	}
}

/*
 * 因为Square的长宽相同，用一个size来统一
 * 所以改写了父类的方法，因为它们实际上都是对size进行修改
 */
class Square extends Rectangle{
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
	
	/**
	 * 这个方法主要作用就是调整长方形的长宽，让长方形的宽调整至比长更长。
	 * 可是就是这样的方法，出问题了，因为如果穿进去的rec实际上是一个正方形的话，那么，程序会无限制的运行下去
	 * 
	 * @param rec
	 * @return 
	 */
	static void testRec(Rectangle rec)
	{
		while(rec.getWidth()<=rec.getHight())//
		{
			rec.setWidth(rec.getWidth());
		}
	}
	
	public static void main(String[] args)
	{
		Rectangle rec=new Square();
		rec.setWidth(5);
		rec.setLength(6);
		testRec(rec);//就是这里出现问题了，这个方法会无限的运行下去，不信的话，你试试就ok了
					
	}
}



