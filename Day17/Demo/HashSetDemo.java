/**
 * @discribe:HashSet集合
 * @Date: 2014-01-07
 * @Author:Gongbiao
 */
import java.util.HashSet;
import java.util.Iterator;
class HashSetDemo{

	public static void main(String[] args){
		/*

		HashSet<String> hash = new HashSet<String>();
		hash.add("Jokey");
		hash.add("Roess");
		hash.add("BoBo");

		for(String s : hash){
		
			System.out.println(s);
		}
		*/

		//Person p1 = new Person("joke");

		//System.out.println(p1);

		HashSet<Person> hash = new HashSet<Person>();
		hash.add(new Person("Jokey"));
		hash.add(new Person("Jokey"));
		hash.add(new Person("Roes"));
		hash.add(new Person("Tom"));
		hash.add(new Person("Jokey"));
		hash.add(new Person("Jokey"));
		hash.add(new Person("Roes"));
		hash.add(new Person("Tom"));

		/*
		Iterator it = hash.iterator(); 
		while(it.hasNext()){
		
			System.out.println(it.next());
		}
		*/

		for(Person per : hash){
		
			System.out.println(per.name);
		}




		System.out.println("is ok !");


	

	}
}

class Person{

	String name;
	public Person(String name){
		this.name = name;
	
	}

	/*

	public String toString(){

		return "这个对象是：" + name;
	
	}
	*/

	///hashCode
	/*
	public int hashCode(){
	
		return 1;
	}
	*/

	//比较对象 equals
	
	public boolean equals (Object obj){

		Person p = (Person)obj;

		return this.name==p.name;

	
	}

	//废除它的hashCode()

	public int hashCode(){
	
		return 1;
	}
	

}
