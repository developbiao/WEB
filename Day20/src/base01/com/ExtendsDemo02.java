package base01.com;

public class ExtendsDemo02 {
	
	public static void main(String[] args){
		Student st1 = new Student("Сʨ��",3,17);
		st1.Show();
		System.out.println("Test runing");
	}

}

class People{
	
  String name;
  int age;
	
	People(){
		System.out.println("�������˵�������������");
	}
	
	People(String name, int age){
		this();  //�Լ������Լ��Ĺ��캯��д��ǰ��
		this.name = name;
		this.age = age;
	}
	
	//People�ĺ���..
	
}

class Student extends People{
	
	private String name;
	private int age;
	private int id;
	
	//����Ĺ��캯��
	
	Student(String name, int age, int id){
		super(name,age);
		this.id = id;	
		
	}
	
	//Student������
	
	public int getId(){
		return id;
	}
	
	public void setId(int id){
		this.id = id;
	}
	
	//Student�ķ���
	
	public void Show(){
		System.out.println("I am a Student My name is " + super.name + ": age is: " +super.age + "Id is :" + id);
	}
	
	
}


