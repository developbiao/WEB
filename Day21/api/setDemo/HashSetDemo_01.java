package api.setDemo;

import java.util.TreeSet;

public class HashSetDemo_01 {
	
	public static void main(String[] args){
		
		TreeSet<Person> set = new TreeSet<Person>();
		set.add(new Person("Jokey",17));
		set.add(new Person("Tom",18));
		set.add(new Person("Roes",19));
		set.add(new Person("Orege",16));
		set.add(new Person("Tom",18));
		
		System.out.println(set);
		
		System.out.println("is ok!");
		
		
	}

}
