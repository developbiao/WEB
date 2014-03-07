package api.Generic.bean;

public class Student extends Person implements Comparable {

	
	public Student(){
		super();
	}
	
	public Student(String name, int age){
		super(name, age);
		
	}
	
//	@Override
//	public int compareTo(Object obj){
//		Student st = (Student)obj;
//		int temp = this.age - st.age;
//		return temp==0?this.name.compareTo(st.name):temp;
//	}
	


}
