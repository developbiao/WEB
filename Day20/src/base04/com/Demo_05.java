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
			System.out.println("�ڲ���������!" + OutClass.this.var);
		}
	}
	
	void fn(){
		InClass ic = new InClass();
		ic.fnx();
	}
}

