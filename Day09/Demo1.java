/*
 * �򵥵ļ̳�
 */
class Person
{
	String name;
	int age;
	public void speak()
	{
	System.out.println("�����й��ˣ�");
	}

}

class Student extends Person
{
	public void study()
	{
		System.out.println(name+"Im Study!");	
	}
}

class Work extends Person
{
	public void works()
	{
		System.out.println(name+"Im works!");
	
	}
}

class Demo1 
{
public static void main(String[] args)
{
	Student s = new Student();
	s.age = 18;
	s.name = "Сǿ";
	s.study();

	Work w = new Work();
	w.age = 27;
	w.name = "С��";
	w.works();
	w.speak();
	
}
}
