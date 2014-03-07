package collection.api.TreeSet;

import java.util.Iterator;
import java.util.TreeSet;

/*
 * TreeSet :可以给其中之一的元素进行指定方式排序,使用的自然顺序
 * 自然顺序:就是元素自身的具备的比较性实现Comparable接口的compareTo方法
 */
public class TreeSetDemo1 {

	public static void main(String[] args) {
		
		//TreeSet ts = new TreeSet();
		TreeSet ts = new TreeSet(new ComparatorByName());
		
		ts.add(new Person("lisi1",20));
		ts.add(new Person("lisi7",20));
		ts.add(new Person("lisi9",22));
		ts.add(new Person("lisi3",21));
		ts.add(new Person("lisi5",26));
		
		Iterator it = ts.iterator();
		
		while(it.hasNext()){
			System.out.println(it.next());
		}
		
		
		

	}

}
