package base04.com;

public class Demo_06 {
	
	public static void main(String[] args){
		try{
		int var = 10 / 0;
		}catch(Exception e){
			System.out.println("������");
			e.printStackTrace();
		}
		
		System.out.println("is ok!");
	}
}

