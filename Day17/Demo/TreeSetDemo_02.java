/**
 * @Discribe:comprable比较对象接口的实现
 * @Date:2014-01-08
 * @Author:GongBiao
 */
import java.util.Comparator;
import java.util.TreeSet;

class TreeSetDemo_02{

	public static void main(String[] args){

		TreeSet<Person> ts = new TreeSet<Person>();
		ts.add(new Person("jokey",17));
		ts.add(new Person("maco",19));
		ts.add(new Person("Rose",87));
		ts.add(new Person("jony",33));

		System.out.println(ts);

		System.out.println("is ok !");
	}
}

class Person implements Comparable{  //implements Comparable

	String name;
	int age;
	
	public Person(String name, int age){
		this.name = name;
		this.age = age;
	}

	public String toString(){
		
		return "name:" + this.name + ", age:" +this.age;
	}

	//override compareTo();
	public int compareTo(Object obj){
	
		Person p = (Person)obj;
		return this.age - p.age;	
	}
}

