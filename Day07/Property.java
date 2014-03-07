/*
 * Practice:DemoProperty
 * Author:Gongbiao
 * Date:2013-9-3
 */
class Demo1
{
	public static void main(String[] args)
	{
		
		Person p = new Person();
		p.setAge(-17);
		p.setName("Ð¡Ò¬×Ó");
		p.Sayhello();
	}
}

class Person
{
	private int age;
	private String name;
	private char sex;

	public void setAge (int Age)
	{
		if (Age>0 && Age<=120)
		  age = Age;
		else
			System.out.println("Age is EROOR!");
		
	}

	public int getAge ()
	{
		return age;
	}

	//name invate
	
	public void setName(String Name)
	{
		this.name = Name;
	}

	public String getName()
	{
		return name;	
	}

	public void Sayhello()
	{
		System.out.println("My Age is "+age);
		System.out.println("My Name is "+name);
	}

	
}
