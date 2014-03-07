package api.genner;

//范型练习一,Gennerics定义在类上
public class GennericsDemo2 {
	public static void main(String[] args){
	
			Util<Student> u = new Util<Student>();
			u.setObject(new Student());
			Student stu =  u.getObject();
			System.out.println(stu);
		
	}

}

class Wroker{
	
}

class Student{
	
}

//定义一个工具类对worker对象进行操作，设置获取
//第一种传统的方法
class Tools{
	private Object obj;
	public void setObject(Object obj){
		this.obj = obj;
	}
	public Object getObject()
	{
		return obj;
	}
}

/*
 * 第二中利用范型解决的方法
 */

class Util<T>{
	private T obj;
	public void setObject(T obj){
		this.obj = obj;
		
	}
	public T getObject(){
		return obj;
	}
}

