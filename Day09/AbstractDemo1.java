/*
 * Practice:��ԱС��ϰ��
 * Author:Gongbiao
 * Date:2013-9-19
 */

abstract class Employee
{
	private String name;
	private String id;
	private double pay;	

	//���캯��
	Employee(String name, String id, double pay)
	{
		this.name = name;
		this.id = id;
		this.pay = pay;
	}

	//����ķ���
	public abstract void works();	
}

class Programmer extends Employee
{
	Programmer(String name, String id, double pay)
	{
		super(name, id, pay);
	
	}

	public void works()
	{
		System.out.println("Im Works is Develop Coding!");
	}
	
		

}

class Manager extends Employee
{
	double bonus;

	Manager(String name, String id, double pay, double bonus)
	{
		super(name, id, pay);

		 this.bonus = bonus;
		
	}

		public void works()
		{
			System.out.println("Im works is Managerment!");
		}
	
}

/*�����������*/
class AbstractDemo1
{
	public static void main(String[] args)
	{
		Manager m = new Manager("manager","1",88.8,500);
		m.works();

		Programmer p = new Programmer("Biao","G233",99.8);
		p.works();

		System.out.println("OUT PUT IS OK!");
		
	}
}
