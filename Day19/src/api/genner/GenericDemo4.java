package api.genner;
//���͵���ϰ��
public class GenericDemo4 {
	public static void main(String[] args){
		ToolsDemo<Student> ts = new ToolsDemo<Student>();
		ts.setObject(new Student());
		ts.getObject().setAge(16);
		ts.getObject().setName("С��");
		ts.getObject().SayHello();
		ts.getObject().method(new Integer(77));
		
		ToolsDemo<Worker> ws = new ToolsDemo<Worker>();
		//ws.setObject(Student());
		ws.setObject(new Worker());
		//���ù�����
		Worker w =  ws.getObject();
		w.setAge(17);
		w.setName("��Ů");
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
		System.out.println(name+":ѧ��"+age);
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
		System.out.println(name + ":����" +age);
	}
	
}

//����һ��������

class ToolsDemo<E>{
	private E obj;
	public void setObject(E obj){
		this.obj = obj;
	}
	public E getObject(){
		return obj;
	}
}
