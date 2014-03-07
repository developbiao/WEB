/*
 * Practice:Person Demo
 * Author:Gongbiao
 * Date:2013-9-22
 */
class Person
{
	private String name;
	private int age;

	Person(String name, int age)
	{
		this.name = name;
		this.age = age;
	}

	public void setName(String name)
	{
		this.name = name;
	}

	public String getName()
	{
		return this.name;
	}

	public void setAge(int age)
	{
		this.age = age;
	
	}

	public int getAge()
	{
		return age;
	}

}

class Student extends Person
{
	Student(String name, int age)
	{
		super(name, age);
	}

		public void Studay()
		{
			System.out.println("IM Student!");
		}

}

class Works extends Person
{
	Works(String name, int age)
	{
		super(name,age);
	}

	public void Work()
	{
		System.out.println("IM Works!");
	}
}

class PersonDemo
{
	public static void main(String[] args)
	{
		Works w = new Works("ะกถþะก",36);
		w.Work();
		String name = w.getName();
		System.out.println(name);
		System.out.println("Output is ok!");
	}
}
