/**
 * 考试抽象类
 * @author zhonghuan
 */
interface Exam
{
	public void chinese();//考语文

	public void math();//考数学

	public void physics();//考物理

	public void geolography();//考地理
}

/**
 * 文科生实现考试抽象类，文科生不考物理
 * @author zhonghuan
 */
class ExamForLiberalArtStu implements Exam
{
	public void chinese()
	{
		System.out.println("考语文");
	}

	public void math()
	{
		System.out.println("考数学");
	}

	public void physics()
	{
		//"不考物理",  不用实现， 没有意义
	}

	public void geolography()
	{
		System.out.println("考地理");
	}
}

/**
 * 理科生实现考试抽象类，理科生不考地理
 * @author zhonghuan
 */
class ExamForScienceStu implements Exam
{
	public void chinese()
	{
		System.out.println("考语文");
	}

	public void math()
	{
		System.out.println("考数学");
	}

	public void physics()
	{
		System.out.println("考物理");
	}

	public void geolography()
	{
		//理科生不考地理，不用实现没有意义
	}
}

class LiberalArtStu
{
	public Exam exam;
	public void test(){
		System.out.println("文科生开始考试:");
		exam.chinese();
		exam.math();
		exam.geolography();
		System.out.println("考试结束");
		System.out.println();
	}
}

class ScienceStu
{
	public Exam exam;
	public void test(){
		System.out.println("理科生开始考试:");
		exam.chinese();
		exam.math();
		exam.physics();
		System.out.println("考试结束");
		System.out.println();
	}
}

public class Main
{
	public static void main(String[] args)
	{
		LiberalArtStu stu1=new LiberalArtStu();  //new 了一个文科生
		stu1.exam=new ExamForLiberalArtStu(); 
		
		ScienceStu stu2=new ScienceStu();  // new 了一个理科生
		stu2.exam=new ExamForScienceStu();
		
		stu1.test();//理科生开始考试
		stu2.test();//文科生开始考试
	}
}