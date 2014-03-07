/**
 * @Discribe:Decorator装饰模式
 *
 * @Author:GongBiao
 * @Date:2014/02/03
 */

class DecoratorDemo_01{

	public static void main(String[] args){

		Person p = new Person();

		//SuperPerson p = new SuperPerson(new Person());
		//SuperPerson p = new SuperPerson(p);  //对功能进行扩展
		p.eat();

		System.out.println("is ok !");
	}

}

class Person{
	public void eat(){

		System.out.println("吃饭");
	}

}

class SuperPerson{

	private Person p;

	SuperPerson(Person p){
		this.p = p;
	}

	public void eat(){
		p.eat();
		System.out.println("睡觉");
		System.out.println("打豆豆");
	}

}


/**
 * ——————————————————————
 * 装饰模式对功能进行扩展
 * ——————————————————————
 */



