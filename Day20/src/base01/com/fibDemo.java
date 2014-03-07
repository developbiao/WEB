package base01.com;

public class fibDemo {

	public static void main(String[] args){
		
		Person p1 = new Person("小强",18);
		p1.Sayhello();
		System.out.println("this is ok!");
	}

}

class Person{
	
	private String name;
	private int age;
	
	//构造函数
	Person(String name, int age){
		this.name = name;
		this.age = age;
	}
	
	public void Sayhello(){
		
		System.out.println("my name is " + name+ "My age is:" + age);
		System.out.println("runing is ok !");
	}
}
