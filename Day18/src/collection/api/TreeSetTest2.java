package collection.api;
import java.util.TreeSet;
import java.util.Iterator;
public class TreeSetTest2 {

	public static void main(String[] args) {
		// TreeSetDemo2 
		TreeSet ts = new TreeSet();
		ts.add(new Person2("lisi1",20));
		ts.add(new Person2("lisi7",28));
		ts.add(new Person2("lisi9",22));
		ts.add(new Person2("lisi3",21));
		ts.add(new Person2("lisi5",26));
		
		Iterator it = ts.iterator();
		
		while(it.hasNext()){
			System.out.println(it.next());
		}
		
		
		

	}

}
