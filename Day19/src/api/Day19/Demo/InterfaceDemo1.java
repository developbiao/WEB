package api.Day19.Demo;

public class InterfaceDemo1 {
	public static void main(String[] args){
	
//		Inst1 in = new Inst1();
//		in.function0();
//		in.function2();
//		
		
		/*
		 * �ڶ���Factory�ķ����Ľ������
		 */
		
		Inst3 in3 = new Inst3();
		in3.function1();
		in3.function0();
		
		
		
		System.out.println("out put is ok!");
		
	}

}

interface My{
	void function0();
	int function1();
	void function2();
}
//������  | ʵ����
abstract class Middle implements My{
	public void function0(){
		System.out.println("hahah");
	}
}

class Inst1 extends Middle {

	public int function1(){
		return 1;
	}
	public void function2(){
		System.out.println(11);
	}
}

class Inst2 extends Middle implements My{
	
	public int function1(){
		return 2;
	}
	public void function2(){
		System.out.println(22);
	}
}
class Inst3 implements My{
	public void function0(){
		System.out.println("hehheehehea");
		
	}
	public int function1(){
		return 3;
	}
	public void function2(){
		System.out.println(33);
	}
}
