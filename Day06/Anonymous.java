/*
 * Pratice:  Anonymous
 * Author: Gongbiao
 * Date: 2013-9-3
 */
class Person
{
	String name;
	int age;
	String sex;

	public void Sayhello()
	{
		System.out.println("Hello, My name is "+name+"Im"+age+"OldAm a god"+sex);
	}
}

class Anonymous
{
	public static void main(String[] args)
	{
		//new Person().name = "С����"; ��������

		ShowPerson(new Person());

	}

		//����һ����ѧ���˵ĵط�
		
		public static void ShowPerson(Person p)
		{
			p.name = "С����";
			p.age = 17;
			p.sex = "Ů";
			p.Sayhello();
		
		}
	
}

/*
 *
 * ��������������������������������������������������������
 * �ܽ᣺Anonymous��������һ���õ��٣���һ�ε��õ�ʱ����
 * ��������������������������������������������������������
 */
