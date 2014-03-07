/*
 *
 * class 构造函数*/
class Demo4
{
	public static void main(String[] args)
	{
		Person p = new Person();	
		Person p1 = new Person("xiaoming",21);
		p1.setName("wangcai");
		p1.getName();
		p1.speak();
		System.out.println("is ok");
	}
}

class Person
{
	private String name;
	private int age;
	Person()
	{
		System.out.println("我爱小学妹!");
	}

	Person(String str, int age)
	{
		this.name = str;
		if(age >=18)
		this.age = age;
		else
		this.age = 33;
	}

	Person(String str)
	{
		this.name = str;
	}

	public void setName(String name)
	{
		this.name = name;
	}

	public String getName()
	{
		return this.name;
	}

	public void speak()
	{
		System.out.println(name+":"+age);
	}
}
