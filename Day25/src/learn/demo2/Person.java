package learn.demo2;

public class Person {
	
	private int age;
	public Person(int age){
		this.age = age;
		
	}
	
	//自定义方法
	public int checkAge() throws AgeOutBoundException{
		if (age > 0 && age <200){
			return age;
		}else{
			System.out.println("------------------");
			throw new AgeOutBoundException();
		}
	}
}
