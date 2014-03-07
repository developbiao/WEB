package api.setHashCode_01;

public class Person {
	private String name;
	private int age;
	
	public Person(){
		super();
	}
	
	public Person(String name, int age){
		
		this.name = name;
		this.age = age;
		
	}
	
	public void setName(String name){
		this.name = name;
	}
	
	public String getName(){
		return this.name;
	}
	
	
	//attribute age
	public void setAge(int age){
		this.age = age;
	}
	
	public int getAge(){
		return this.age;
	}

	@Override
	public String toString() {
		return "Name :" + this.name + " Age:" + this.age;
	}
	
	
	@Override  
	public int hashCode(){
		return this.name.hashCode()  + age;
	}
	
	@Override
	public boolean equals(Object obj){
		if(!(obj instanceof Person))
			return false;
			
		
		Person p = (Person)obj;
		
		return this.name.equals(p.name) && this.age==p.age;
		
	}
	
	
	
	

	
	
	
	
	
	
	
}
