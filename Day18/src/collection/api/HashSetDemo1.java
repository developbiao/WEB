package collection.api;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;

//HashLinked Demo
public class HashSetDemo1 {
	public static void main(String[] args){
		HashSet<String> hs = new LinkedHashSet<String>();
		hs.add("hahah");
		hs.add("thisaaa");
		hs.add("aaaaa");
		hs.add("bbbbbb");
		hs.add("namess");
		
		Iterator<String> it = hs.iterator();
		
		while(it.hasNext()){
			System.out.println(it.next());
		}
	}

}
