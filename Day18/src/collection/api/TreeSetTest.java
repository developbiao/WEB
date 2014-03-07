package collection.api;
import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetTest {
	public static void main(String[] args){
		
		TreeSet ts = new TreeSet();
		
		ts.add(new Person("lisi8",24));
		ts.add(new Person("lisi1",21));
		ts.add(new Person("lisi0",27));
		ts.add(new Person("lisi2",22));
		
		Iterator it = ts.iterator();
		while(it.hasNext()){
			System.out.println(it.next());
		}
	}

}
