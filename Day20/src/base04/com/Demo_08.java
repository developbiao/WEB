package base04.com;

public class Demo_08 {
	
	public static void main(String[] args){
		
		TestDemo t1 = new TestDemo();
		int var = t1.Method();
		System.out.println("var is :" + var);
		
		System.out.println("is ok!");
	}
	
	

}

class TestDemo{
	public int Method(){
		int x = 0;
		try{
			try{
				int a = 1 / 0;
				x++;
				return 11;
			}catch(Exception e){
				x++;
				return 22;
			}
			finally{
				x++;
				return 33;
			}
			
		}catch(Exception e){
			x++;
			return 2;
		}finally{
			x++;
			return 3;
		}
	}
	
	
}
