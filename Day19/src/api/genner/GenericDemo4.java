package api.genner;
//范型的练习题
public class GenericDemo4 {
	public static void main(String[] args){
		ToolsDemo<Student> ts = new ToolsDemo<Student>();
		ts.setObject(new Student());
		ts.getObject().setAge(16);
		ts.getObject().setName("小芳");
		ts.getObject().SayHello();
		ts.getObject().method(new Integer(77));
		
		ToolsDemo<Worker> ws = new ToolsDemo<Worker>();
		//ws.setObject(Student());
		ws.setObject(new Worker());
		//调用工具类
		Worker w =  ws.getObject();
		w.setAge(17);
		w.setName("美女");
		w.SayHello();
		
		
		
	}

}

class Student{
	private String name;
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

	private int age;
	
	public void SayHello(){
		System.out.println(name+":学生"+age);
	}
	
	public <T> void method(T obj){
		System.out.println("output is :"+obj);
		
	}
	
}
class Worker extends Student{
	private String name;
	private int age;
	
	public void setName(String name){
		this.name = name;
		
	}
	public String getName(){
		return name;
	}
	
	public void setAge(int age){
		this.age = age;
	}
	
	public int getAge(){
		return age;
	}
	
	public void SayHello(){
		System.out.println(name + ":工人" +age);
	}
	
}

//创建一个工具类

class ToolsDemo<E>{
	private E obj;
	public void setObject(E obj){
		this.obj = obj;
	}
	public E getObject(){
		return obj;
	}
}
