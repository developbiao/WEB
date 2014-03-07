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
		//new Person().name = "小橘子"; 匿名对象

		ShowPerson(new Person());

	}

		//定义一个开学招人的地方
		
		public static void ShowPerson(Person p)
		{
			p.name = "小橘子";
			p.age = 17;
			p.sex = "女";
			p.Sayhello();
		
		}
	
}

/*
 *
 * ————————————————————————————
 * 总结：Anonymous匿名对象一般用的少，在一次调用的时候用
 * ————————————————————————————
 */
