package api.setDemo;

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
	//override toString();����
	
	public String toString() {
		//Override toString()
		return  "����: " + this.name + "\n����: " + this.age;
	}
	
	
	public int compareTo(Object o){
		
		Person p = (Person)o;
		
			if(this.age > p.age)
				return 1;
			if(this.age == p.age)
				return this.name.compareTo(p.name);
			return -1;
	}
	
	

}
