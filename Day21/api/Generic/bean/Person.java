package api.Generic.bean;

public class Person implements Comparable{
	
	private String name;
	private int age;
	public Person() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Person(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
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
	@Override
	public String toString() {
		return "name:" + this.name + " age:" + this.age;
	}
	
	@Override
	public int compareTo(Object obj){   //compareTo();
		Person p = (Person) obj;
		
		int temp = this.age - p.age;
		return temp==0?this.name.compareTo(p.name):temp;
		
	}
	
	
	
	
	
	
	
	

}
