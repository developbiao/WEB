package api.genner;

//������ϰһ,Gennerics����������
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

//����һ���������worker������в��������û�ȡ
//��һ�ִ�ͳ�ķ���
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
 * �ڶ������÷��ͽ���ķ���
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

