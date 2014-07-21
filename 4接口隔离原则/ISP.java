/**
 * 考试抽象类
 * @author zhonghuan
 */
interface Exam
{
	public void chinese();//考语文
	public void math();//考数学
}

/**
 * 理科生考试接口
 */
interface ScienceExam{
	public void physics();//考物理
}

/**
 * 文科生考试接口
 */
interface LiberalArtExam{
	public void geolography();//考地理
}

/**
 * 文科生考试实现类
 * @author zhonghuan
 */
class ExamForLiberalArtStu implements Exam,LiberalArtExam
{
	public void chinese()
	{
		System.out.println("考语文");
	}

	public void math()
	{
		System.out.println("考数学");
	}

	public void geolography()
	{
		System.out.println("考地理");
	}
}

/**
 * 理科生考试实现类
 * @author zhonghuan
 */
class ExamForScienceStu implements Exam,ScienceExam
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
}

class LiberalArtStu
{
	public ExamForLiberalArtStu exam;
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
	public ExamForScienceStu exam;
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