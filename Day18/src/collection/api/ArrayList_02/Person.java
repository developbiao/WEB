package collection.api.ArrayList_02;

public class Person {
	private String name;
	private int age;
	
	public Person(){
		super();
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
	public boolean equals(Object obj) {
		
		if(!(obj instanceof Person))
			return false;
		
		Person p = (Person)obj;
		
		return this.name.equals(p.name) && this.age==p.age;
		
	}

	@Override
	public String toString() {
		return "Name:" + this.name + ",Age:" + this.age;
	}

	
	
	
	
	
	
	
	
	
}
