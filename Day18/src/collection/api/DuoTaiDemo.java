package collection.api;

public class DuoTaiDemo {
	public static void main(String[] args){
		
		Animal a = new Cat();
		a.eat();
		
		//向下转型
		Cat c1 = (Cat)a;
		c1.catchMouse();
		
	}

}

