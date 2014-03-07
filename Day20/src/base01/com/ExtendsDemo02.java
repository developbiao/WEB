package base01.com;

public class ExtendsDemo02 {
	
	public static void main(String[] args){
		Student st1 = new Student("小狮子",3,17);
		st1.Show();
		System.out.println("Test runing");
	}

}

class People{
	
  String name;
  int age;
	
	People(){
		System.out.println("呼吸是人的生命基本特征");
	}
	
	People(String name, int age){
		this();  //自己调用自己的构造函数写在前面
		this.name = name;
		this.age = age;
	}
	
	//People的函数..
	
}

class Student extends People{
	
	private String name;
	private int age;
	private int id;
	
	//子类的构造函数
	
	Student(String name, int age, int id){
		super(name,age);
		this.id = id;	
		
	}
	
	//Student的属性
	
	public int getId(){
		return id;
	}
	
	public void setId(int id){
		this.id = id;
	}
	
	//Student的方法
	
	public void Show(){
		System.out.println("I am a Student My name is " + super.name + ": age is: " +super.age + "Id is :" + id);
	}
	
	
}


