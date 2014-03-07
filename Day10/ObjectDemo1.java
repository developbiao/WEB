/*
 * Practice:ObjectDemo1
 * Author:Gongbiao
 * Date:2013-9-27
 */
class Demo
{

}

class Test
{

}

class Person extends Object  //默认继承Object
{
	private int age;
	
	Person(int age)
	{
		this.age = age;
	}

	public boolean equals(Object obj)  //覆盖原来的方法
	{
		if (!(obj instanceof Person))  //类型的if
			return false;
		Person p = (Person)obj;  //向下提升

		return this.age==p.age;
	}
}

class ObjectDemo1
{
	public static void main(String[] args)
	{
		Demo d1 = new Demo();
		Demo d2 = d1;

		//比较人的对象
		Person p1 = new Person(17);
		Person p2 = new Person(18);
		boolean b1 = p1.equals(p2);

		System.out.println("Age="+b1);



		boolean b = d1.equals(d2);// 比较对象是否相等
		System.out.println("b="+b);

	}
}
