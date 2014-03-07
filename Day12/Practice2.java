/*
 * Practice:Interface 7
 * info://补足代码;调用两个函数,要求用匿名内部类
 */

interface Inter
{
	void show(int a , int b);
	void func();

}

class Practice2
{
	public static void main(String[] args)
	{
		//补中代码
		Inter in = new Inter()
		{
			public void show(int a , int b)
			{
				System.out.println(a+b);	
			}
		
			public void func()
			{}
		};

		in.show(4,5);
		in.func();
	}
}
