package collection.api;
import java.util.HashSet;
import java.util.Iterator;

public class hashsetDemo {
	public static void main(String[] args){
		HashSet hs = new HashSet();
		hs.add("hehe");
		hs.add("heihei");
		hs.add("xixi");
		
		Iterator it = hs.iterator();
		
		while(it.hasNext()){
			System.out.println("Hash:"+it.next());    //it.next();
		}
	}

}
