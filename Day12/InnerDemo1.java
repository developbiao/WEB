/*
 * Practice:内部类定义在局部位置上，为什么不能访问局部变量啊？
 */
class Outer{
	private Object obj;
	public void show()
	{
		int x = 3;

		class Inner
		{
			//覆盖了Objecto类捉的toString 方法
			public String toString()
			{
				return "Inner :";
			}
			
		}

		Inner in = new Inner();
		System.out.println(in.toString());
		obj = in; //将new Inner()对象的地址赋值给父类引用obj.

	}

	public void function()
	{
		System.out.println("obj:"+obj.toString());
	}
}

class InnerDemo1
{
	public static void main(String[] args)
	{
		Outer out = new Outer();
		out.show();	
		out.function();
		
	}
}
