package collection.api;

//�������������
public class GetClassName {
	
	public String getNameByClass(){
		
		String name = "";
		System.out.println("ͨ���౾���ö���");
		Class UserClass = this.getClass();
		System.out.println("��ö���ɹ�!");
		
		System.out.println("ͨ�������������:");
		name = UserClass.getName();
		System.out.println("��������ɹ�!");
		return name;
	}
	
	public static void main(String[] args){
		
		GetClassName get = new GetClassName();
		System.out.println("����Ϊ:" +get.getNameByClass());
	}

}
