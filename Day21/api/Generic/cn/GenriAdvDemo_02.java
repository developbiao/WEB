package api.Generic.cn;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

import api.Generic.bean.Person;
import api.Generic.bean.Student;


public class GenriAdvDemo_02 {
	
	public static void main(String[] args){
		
		ArrayList<Person> al = new ArrayList<Person>();
		al.add(new Person("lisi1", 17));
		al.add(new Person("lisi2", 19));
		al.add(new Person("lisi3",23));
		
		ArrayList<Student> st = new ArrayList<Student>();
		st.add(new Student("duanduan",21));
		st.add(new Student("duanduan1",29));
		st.add(new Student("duanduan2",33));
		st.add(new Student("duanduan3",23));
		
	
		
		
		printf(al);
		System.out.println("-----------------");
		printf(st);
		
		System.out.println("is ok !");
	}

	//µü´ú·½·¨
	
	public static void printf(Collection<? extends Person> coll){
		
		Iterator<? extends Person> it = coll.iterator();
		while(it.hasNext()){
			System.out.println(it.next());
		}
	}
}
