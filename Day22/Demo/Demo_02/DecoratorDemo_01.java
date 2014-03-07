/**
 * @Discribe:Decoratorװ��ģʽ
 *
 * @Author:GongBiao
 * @Date:2014/02/03
 */

class DecoratorDemo_01{

	public static void main(String[] args){

		Person p = new Person();

		//SuperPerson p = new SuperPerson(new Person());
		//SuperPerson p = new SuperPerson(p);  //�Թ��ܽ�����չ
		p.eat();

		System.out.println("is ok !");
	}

}

class Person{
	public void eat(){

		System.out.println("�Է�");
	}

}

class SuperPerson{

	private Person p;

	SuperPerson(Person p){
		this.p = p;
	}

	public void eat(){
		p.eat();
		System.out.println("˯��");
		System.out.println("�򶹶�");
	}

}


/**
 * ��������������������������������������������
 * װ��ģʽ�Թ��ܽ�����չ
 * ��������������������������������������������
 */



