/*
 * @Discribe:定义的一个学生类用HashMap来存储对象
 * @Date:2014-01-13
 * @Author:GongBiao
 */
package api.bean.cn;

public class Student implements Comparable<Student>{
	
	private String name;
	private int age;
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Student(String name, int age) {
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
	public int hashCode(){
		final int NUBMER = 37;
		return name.hashCode() + age * NUBMER;
	}
	
	@Override 
	public boolean equals(Object obj){
		if(this == obj)
			return true;
		if(!(obj instanceof Student))
			throw new ClassCastException("类型不匹配!");
		Student st = (Student) obj;
		return this.name.equals(st.name) && this.age == st.age;
	}
	@Override
	public int compareTo(Student o) {
		int temp = this.age - o.age;
		return temp == 0?this.name.compareTo(o.name):temp;
	}

	

}
