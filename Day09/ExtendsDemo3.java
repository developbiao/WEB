/*
 * Practice:构造函数的练习2
 * Author:Gongbiao
 * Date:2013-9-19
 */

class Fu extends Object
{
	int num;
/*
	Fu()
	{
		System.out.println("Fu running!");	
	}
	*/
	Fu(int x)
	{
		System.out.println("Fu runing="+x);	
	}
}

class Zi extends Fu
{
	
	Zi()
	{
		super(13); //手动指定父类的内容
		
		System.out.println("zi num"+num);
	}	
	Zi(int x)
	{
		//super();
		this();  //调用自己的构造函数

		System.out.println("zi run"+x);
	}

}

class ExtendsDemo3
{
	public static void main(String[] args)
	{
		new Zi(32);	
	}
}
