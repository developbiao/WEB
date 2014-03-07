/**
 * @Discribe:HashLinked ”––Ú¡∑œ∞Ã‚ 
 * @Date:2014-01-12
 * @Author:GongBiao
 */
import java.util.Iterator;
import java.util.LinkedHashSet;
class HashLinkedDemo_01{

	public static void main(String[] args){

		LinkedHashSet<String> link = new LinkedHashSet<String>();
		link.add("abc1");
		link.add("abc2");
		link.add("abc3");
		link.add("abc4");
		link.add("abc5");

		Iterator<String> it = link.iterator();
		while(it.hasNext()){
			System.out.println(it.next());
		}

	
		System.out.println("is ok !");
	}
}
