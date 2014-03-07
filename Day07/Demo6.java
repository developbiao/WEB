/*
 * Pratice:构造函数的调用，多个构造函数对一个函数进行初始化
 * Author:Gongbiao
 * Date:2013-9-12*/
class Demo6
{
	public static void main(String[] args)
	{
	
		Person p1 = new Person("xiaoqiang",17);
		Person p2 = new Person("wangcai",18);
		p1.speak();
		p2.speak();
	//	{

		String str = "sasasa"; //这里是一个局部变量它的生命周期在这里面
	//	}
		//会出错

		System.out.println(str);
	}
}

class Person
{
	private String name;
	private int age; 

	{
	//构造函数代码块的作用
		//System.out.println("我是用来多次对构造初始化的");
		cry();  //多次调用哭
	}
	Person(String name)
	{
		this.name = name;
	}

	Person(String name, int age)
	{
		this(name); //调用构造函数
	//	this.name = name;
		this.age = age;
	}

	public  void speak()
	{
		System.out.println(name+"::::"+age);
	}

	public void cry()
	{
		System.out.println("我出生的时候在哭!哇哇！");
	}
}

