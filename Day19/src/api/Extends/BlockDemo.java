package api.Extends;
//Java中构造函数的调用
public class BlockDemo {
	
	public static void main(String[] args){
		
		China ch  = new China("S骏",17,01);
		ch.Sayhello();
		
//		System.out.println(ch.getAge());
//		System.out.println(ch.getName());
		
		
		
	}
	

}

class Person{
	
	private String name;
	private int age;
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	Person(String name, int age){
		this.name = name;
		this.age = age;
	}

}

class China extends Person{
	
	private int id;
	
	
	
	China(String name, int age, int id){
		super(name , age);
		this.id = id;
	}
	
	public int getId(){
		return id;
	}
	public void setId(int id){
	
		this.id = id;
	}
	
	
	public void Sayhello(){
		
		System.out.println("你好："+id);
		System.out.println(getAge());
		System.out.println(getName());
		
		
		
	}
	
	
	
}
