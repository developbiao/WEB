package api.Extends;

public class ExtendsDemo2 {
	public static void main(String[] args){
		Student st = new Student("小玲",16,7);
		st.SayHello();
		
		System.out.println("run is ok ....");
		
	}

}

class Person3{
	
	private String name;
	private int age;
	
	Person3(){
		System.out.println("人会呼吸空气");
	}
	
	Person3(String name, int age){
		
		this();
		this.name = name;
		this.age = age;
		
	}
}

class Student extends Person3{
	
	private int id;
	
	Student(String name, int age, int id){
		super(name,age);
		this.id = id;
	}
	
	public int getId(){
		return id;
	}
	public void set(int id){
		this.id = id;
	}
	
	
	
	
	
	public void SayHello(){
	
		System.out.println("Hello everyone my id is :" + id);
		System.out.println();
	
	}
	
}
