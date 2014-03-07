package base02.com;

public class AbstractDemo01 {
	public static void main(String[] args){
		Cat c1 = new Cat();
		Cat c2 = new Cat();
		
		new Cat().Method();
		new Cat().Sayhello();
		
		if(c1 instanceof Animal)
			System.out.println("this c1 instanceof c2");
	}

}

abstract class Animal{
	public abstract void Sayhello();
	public abstract void Method();
}

class Cat extends Animal{
	public void Sayhello(){
		System.out.println("MiMi");
	}
	
	public void Method(){
		System.out.println("Catch Mose!");
	}
}
