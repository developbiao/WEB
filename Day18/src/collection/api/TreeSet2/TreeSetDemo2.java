package collection.api.TreeSet2;

import java.util.Iterator;
import java.util.TreeSet;

/*
 * 对字符进行长度排序 
*/
public class TreeSetDemo2 {
	
	public static  void main(String[] args){
		
		TreeSet ts = new TreeSet(new ComparatorByLength());
		
		ts.add("aaaaa");
		ts.add("zz");
		ts.add("nbaq");
		ts.add("abc");
		
		Iterator it =  ts.iterator();
		while(it.hasNext()){
			System.out.println(it.next());
		}
		
	}
	

}
