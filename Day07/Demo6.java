/*
 * Pratice:���캯���ĵ��ã�������캯����һ���������г�ʼ��
 * Author:Gongbiao
 * Date:2013-9-12*/
class Demo6
{
	public static void main(String[] args)
	{
	
		Person p1 = new Person("xiaoqiang",17);
		Person p2 = new Person("wangcai",18);
		p1.speak();
		p2.speak();
	//	{

		String str = "sasasa"; //������һ���ֲ�������������������������
	//	}
		//�����

		System.out.println(str);
	}
}

class Person
{
	private String name;
	private int age; 

	{
	//���캯������������
		//System.out.println("����������ζԹ����ʼ����");
		cry();  //��ε��ÿ�
	}
	Person(String name)
	{
		this.name = name;
	}

	Person(String name, int age)
	{
		this(name); //���ù��캯��
	//	this.name = name;
		this.age = age;
	}

	public  void speak()
	{
		System.out.println(name+"::::"+age);
	}

	public void cry()
	{
		System.out.println("�ҳ�����ʱ���ڿ�!���ۣ�");
	}
}

