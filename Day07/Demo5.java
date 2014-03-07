/**
 *Practice: 比较对象年龄
 * Author:Gonbiao
 */

class Demo5
{
	public static void main(String[] args)
	{
		Person p = new Person(18);
		Person p1 = new Person(18);
		boolean b = p1.compare(p);
		
		System.out.println(b);
	}
}

class Person
{
	private int age;

	Person (int a)
	{
		age = a;
	}
	public void setAge(int a)
	{
		age = a;
	}
	public int getAge()
	{
		return age;
	}
	public boolean compare(Person p)
	{
		return this.age==age;
	}
}
