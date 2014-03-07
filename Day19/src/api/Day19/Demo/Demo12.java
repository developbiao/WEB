package api.Day19.Demo;

public class Demo12 {
	public static void main(String[] args){
		
		Inste2 in = new Inste2();
		in.function1();
		in.Sayhello();
		
		Inste3 in2 = new Inste3();
		in2.function1();
		in2.Sayhello();
		
		System.out.println("loading is ok!");
			
	}

}

interface InterDemo{
	void function1();
	void Sayhello();
	boolean function3();
}

//abstract class Middle implements InterDemo{
//	public void function1(){
//		System.out.println("Machine is run!");
//	}
//	
//	
//}

//工厂模式
class Factroy{
	public InterDemo getInter(){
		return null;
	}
}




class Inste2  implements InterDemo {
	public void function1(){
		System.out.println("Machine is run!");
	}
	

	public void Sayhello(){
		System.out.println("LikMill,good is time!");
	}
	public boolean function3(){
		return true;
	}

	
}

class Inste3 implements InterDemo  {
	public void function1(){
		System.out.println("Machine is run!");
	}
	
	
	
	public void Sayhello(){
		System.out.println("Mike, is good boy");
	}
	
	public boolean function3(){
		return true;
	}

	
}


