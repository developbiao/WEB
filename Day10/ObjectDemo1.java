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

class Person extends Object  //Ĭ�ϼ̳�Object
{
	private int age;
	
	Person(int age)
	{
		this.age = age;
	}

	public boolean equals(Object obj)  //����ԭ���ķ���
	{
		if (!(obj instanceof Person))  //���͵�if
			return false;
		Person p = (Person)obj;  //��������

		return this.age==p.age;
	}
}

class ObjectDemo1
{
	public static void main(String[] args)
	{
		Demo d1 = new Demo();
		Demo d2 = d1;

		//�Ƚ��˵Ķ���
		Person p1 = new Person(17);
		Person p2 = new Person(18);
		boolean b1 = p1.equals(p2);

		System.out.println("Age="+b1);



		boolean b = d1.equals(d2);// �Ƚ϶����Ƿ����
		System.out.println("b="+b);

	}
}
