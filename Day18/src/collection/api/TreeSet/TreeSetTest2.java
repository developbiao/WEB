package collection.api.TreeSet;

import java.util.Iterator;
import java.util.TreeSet;

//×Ö·û´®µÄÅÅÐò
public class TreeSetTest2 {
	public static void main(String[] args){
		TreeSet ts = new TreeSet(new ComparatorByLength());
		
		ts.add("hahah");
		ts.add("bbbda");
		ts.add("zzzz");
		ts.add("abc");
		
		Iterator it = ts.iterator();
		while(it.hasNext()){
			System.out.println(it.next());
			
			
		}
		}

}
