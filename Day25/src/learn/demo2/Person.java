package learn.demo2;

public class Person {
	
	private int age;
	public Person(int age){
		this.age = age;
		
	}
	
	//�Զ��巽��
	public int checkAge() throws AgeOutBoundException{
		if (age > 0 && age <200){
			return age;
		}else{
			System.out.println("------------------");
			throw new AgeOutBoundException();
		}
	}
}
