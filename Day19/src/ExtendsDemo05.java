
public class ExtendsDemo05 {
	public static void main(String[] args){
		
		new Motorola().Call();
		System.out.println("Is ok!");
	}

}

class Phone{
	
	public void Call(){
		System.out.println("´òµç»°£¡");
	}
}
class Motorola extends Phone{
	
	public void Call(){
			System.out.println("Hello Moto!");
		}
	
}
