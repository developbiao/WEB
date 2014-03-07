abstract class Demo
{
	abstract void show();
	
}	

class Outer
{
	private int num = 5;

	public void method()
	{
		Demo d = new Demo()	
		{
			void show()
			{
				System.out.println("show runing....."+num);
			}
		};
		d.show();
	}
}

class ONInnerDemo1
{
	public static void main(String[] args)
	{
		Outer ou = new Outer();
		ou.method();
	}
}

