/*
 * Pracetice:Interface
 * Author:Gongibao
 * Date:2013-9-25
 */
abstract class AbsDeom
{
	abstract void show();
	abstract void method();
}

interface Inter  // 定义一个接口
{
	public static final int num = 3;
	public abstract void show();

}

//定义一个接口的子类对该接口中的方法进行覆盖

class InterImple implements Inter
{
	public void show()
	{
		System.out.println("show1");
	}

	public void method()
	{
		System.out.println("method");
	}
}




class InterfaceDemo1 //主函数入口
{
	public static void main(String[] args)
	{
		InterImple p = new InterImple();
		p.show();		
		p.method();
	}
}
