/**
 * @Discribe:练习TreeSet的两中排序方式comparator比较器
 * @Date:2014-01-13
 * @Author:GongBiao
 */
package api.TreeSetDemo_1.com;

import java.util.TreeSet;
import java.util.Iterator;
import api.Generic.bean.Person;
import api.Generic.bean.ComparatorByName;

public class TreeSetDemo_01 {
	
	public static void main(String[] args){
		
		//TreeSet<Person> ts = new TreeSet<Person>();  //自然排序
		
		TreeSet<Person> ts = new TreeSet<Person>(new ComparatorByName());  //按照自定义比较器排序
		
		ts.add(new Person("meke1",17));
		ts.add(new Person("meke2",16));
		ts.add(new Person("meke3",17));
		ts.add(new Person("mike4",18));
		ts.add(new Person("mike7",23));
		
		Iterator<Person> it = ts.iterator();
		
		while(it.hasNext()){
			System.out.println(it.next());
		}
		
		
		System.out.println("is ok !");
	}

}
