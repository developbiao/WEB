package collection.api;
/**
 * @version 1.0
 * @author GONGBIAO
 * @see ʲôʱ�򸲸�����
 *
 */
public class ExtendsDemo1 {
	public static void main(String[] args){
		
		NewPhone phone = new NewPhone();
		phone.show();
	}

}

class Phone{
	
	void call(){
	}
	
	void show(){
		System.out.println("number");
		
	}
}

class NewPhone extends Phone{
	void show(){
		System.out.println("name");
		System.out.println("pic");
		super.show();  //���ý���ķ���
	}
	
}
