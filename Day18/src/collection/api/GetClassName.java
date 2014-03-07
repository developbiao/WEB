package collection.api;

//获得完整的类名
public class GetClassName {
	
	public String getNameByClass(){
		
		String name = "";
		System.out.println("通过类本身获得对象");
		Class UserClass = this.getClass();
		System.out.println("获得对象成功!");
		
		System.out.println("通过类对象获得类名:");
		name = UserClass.getName();
		System.out.println("获得类名成功!");
		return name;
	}
	
	public static void main(String[] args){
		
		GetClassName get = new GetClassName();
		System.out.println("类名为:" +get.getNameByClass());
	}

}
