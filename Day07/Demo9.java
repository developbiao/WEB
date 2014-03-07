/*
 * Practice:类的this
 * Date:2013-9-13
 * Author:Gongibao
 */
class Person
{
	private String name;
	private int age;

	Person(String name)
	{
		this.name = name;
	}
	
	public boolean Function(Person p)
	{
		//if this.name = name;
		return this.name==p.name;
	}


}
class Demo9
{
	public static void main(String[] args)
	{
		Person p1 = new Person("小Q");
		Person p2 = new Person("小Q");

		boolean b = p2.Function(p1);

		System.out.println(b);
	}
}
