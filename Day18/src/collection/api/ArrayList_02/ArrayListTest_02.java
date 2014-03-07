package collection.api.ArrayList_02;

import java.util.ArrayList;

public class ArrayListTest_02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Person> list = new ArrayList<Person>();
		list.add(new Person("Gongbiao",17));
		list.add(new Person("Wanger", 17));
		list.add(new Person("Gongbiao",17));
		list.add(new Person("Jokey",18));
		list.add(new Person("Tom",19));
		list.add(new Person("Tom",19));
		
		System.out.println(list);
		
	}

}
