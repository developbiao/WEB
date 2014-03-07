package base01.com;

public class ExtendsDemo01 {
	
	public static void main(String[] args){
		
		//代码块的问题学习理解
		new TestBlock().Show();
	
	}

}

class TestBlock{
	
	
	int a = 10;
	
	
	public void Show(){
		System.out.println("this a :" +a);
	}
}

