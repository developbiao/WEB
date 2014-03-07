/*
 * Practice:SingleDemo2
 * Author:Gongbiao
 * Date:2013-9-17
 */
class SuperMan
{
	private int age;
	private String name;

	private static SuperMan man = new SuperMan(" ����");
	private SuperMan(String name)
	{
		this.name = name;
	}

	public void setAge(int age)
	{
		this.age = age;
	}

	public int getAge()
	{
		return this.age;
	}

	public String getName()
	{
		return this.name;
	}

	//���û�и㶮
	public static SuperMan getInstance()
	{
		return man;
	}
}

//������
class SingleDemo2
{
	public static void main(String[] args)
	{
		SuperMan s1 = SuperMan.getInstance();
		SuperMan s2 = SuperMan.getInstance();
		
		System.out.println(s1==s2);
		System.out.println(s1.getName());
		s1.setAge(18);
		s2.setAge(20);

		System.out.println(s1.getAge());
	}
}
