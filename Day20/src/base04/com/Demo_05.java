package base04.com;

public class Demo_05 {

	public static void main(String[] args){

	 OutClass out = new OutClass();
	 out.fn();
		
		System.out.println("is ok !");
	}
}

class OutClass{
	 int var = 7;
	 class InClass{
		void fnx(){
			System.out.println("内部类运行中!" + OutClass.this.var);
		}
	}
	
	void fn(){
		InClass ic = new InClass();
		ic.fnx();
	}
}

