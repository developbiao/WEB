interface Inter
{
	public void show1();
	public void show2();
}

class Outer 
{
	/*
	class Inner implements Inter
	{
		public void show1();
		public void show2();
		
	}
	*/

	public void method()
	{
		Inter in = new Inter()
		{
			private int a = 3;
			public void show1()
			{
			
			}
			public void show2()
			{
			
			}
			/*特有的方法成员方法*/
			public void show3()
			{
				System.out.println("show3...");
			}
			
		};
		in.show1();
		in.show2();

	}
}

class ONInnerDemo2
{
	public static void main(String[] args)
	{
		Outer ou = new Outer();
		ou.method();
	}
}
