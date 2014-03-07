package collection.api;

public class Person2 implements Comparable{
	private String name;
	private int age;
	
	public Person2(){
		super();
	}
	
	public Person2(String name, int age){
		super();
		this.name = name;
		this.age = age;
		
	}
	
	public String getName(){
		return name;
	}
	public void setName(String name){
		this.name = name;
	}
	
	public int getAge(){
		return age;
	}
	public void setAge(int age){
		this.age = age;
	}

	@Override
	//覆盖toString的方法
	public String toString() {
		// TODO Auto-generated method stub
		return name+":"+age;
	}

	@Override
	//覆盖CompareTo方法
	//按照Person的年龄进行比较
	public int compareTo(Object o) {
		Person2 p = (Person2)o;
		
		//int temp = this.age - p.age;
		//return temp==0?this.name.compareTo(p.name):temp;
		
		int temp = this.name.compareTo(p.name);
		return temp==0?this.age-p.age:temp;
	}
	
	
	

}
 