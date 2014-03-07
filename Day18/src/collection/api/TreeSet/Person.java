package collection.api.TreeSet;

public class Person {
	private String name;
	private int age;
	public Person() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Person(String name, int age){
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
		// TODO Auto-generated method stub
		return name+":"+age;
	}
	@Override
	public boolean equals(Object obj) {
		// 覆盖Object类中的equals方法,建立Person对象
		
		if(!(obj instanceof Person))
			return false;
		Person p = (Person)obj;
		return (this.name.equals(p.name) && this.age==p.age);
			
		
	}
	
	
	
	
	
	
	
	
	

}
