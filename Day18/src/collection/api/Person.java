package collection.api;

public class Person  implements Comparable{
	private String name;
	private int age;
	public Person() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	//Ctrl + shift + S > 创建构造函数
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
	
	/**
	 * 覆盖object类中的equals的方法,建立Peron对象
	 * 判断是否相同依据,根据Person自身的特点来判断
	 * 
	 */
	
//	public boolean equals(Object obj){
//		if(!(obj instanceof Person))
//			return false;
//		Person p = (Person)obj;  //强制转换
//		
//		if(this.name.equals(p.name) && this.age==p.age)
//			return true;
//		return  false;
//		
//		return this.name.equals(p.name) && this.age == p.age;  //equals equals equals equals
//		
//		
//	}

	@Override   
	/*
	 * Override toString method
	 * @see java.lang.Object#toString()
	 */
	public String toString() {
		// TODO Auto-generated method stub
		return name+":"+age;
	}
	
	/**
	 * 覆盖Object类中的hashCode方法.建立person 对象
	 * 
	 */
	public int hashCode(){
		final int NUMBER = 27;
		return name.hashCode() + age + age * NUMBER;
		
	}
	
	/**
	 * 再覆盖equals方法
	 */
	public boolean equals(Object obj){
		if(!(obj instanceof Person))
			return false;
		Person p = (Person)obj;
		return this.name.equals(p.name) && this.age == p.age;
	}

	@Override  
	public int compareTo(Object o) {
		// TODO Auto-generated method stub
		Person p = (Person)o;
		if(this.age>p.age)
			return 1;
		if(this.age<p.age)
			return -1;
		
		return 0;
	}
	
	
	
	
	
	

}
