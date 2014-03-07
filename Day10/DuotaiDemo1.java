/*
 * Practice:��̬��ϰ
 * Author:Gongbiao
 * DATE:2013-9-27
 */

class Animal 
{
	void breathe()
	{
		System.out.println("Breathe����Breathe");
	}	
}

class Dog extends Animal
{
	void show()
	{
		System.out.println("������!");
	}
}

class Cat extends Animal
{
	void show()
	{
		System.out.println("������!");
	}
}

class Pig extends Animal
{
	void show()
	{
		System.out.println("�ཽ�!");
	}
	

}

class DuotaiDemo1
{
	public static void main(String[] args)
	{
		Animal d1 = new Pig();
		Animal d2 = new Dog();

		method(d2);
		//pig p1 = new pig();
		//��һ��ת���ķ���
	//	Pig p = (Pig)d1;

	//	p.show();

		System.out.println("Output is ok !");
	}

	public static void method(Animal a)
	{
		a.breathe();	
		if (a instanceof Pig) 
		{
			Pig p = (Pig)a; //ClassCastException
			p.show();
		}

		else if (a instanceof Cat)
		{
			Cat c = (Cat)a;
			c.show();

		
		}

		else {
			Dog d = (Dog)a;
			d.show();
		}
	}
}
