package collection.api;
import java.util.Iterator;
import java.util.HashSet;

/*
 * 往hashSet集合中存储Person对象，如果姓名各年龄相同，视为同一个人。        视相同元素     
 */
public class HashSetDemo2 {
	public static void main(String[] args){
		HashSet hs = new HashSet();
		/*
		 * HashSet 集合数据结构是哈希表，所以存储元素的时候
		 * 使用的元素的hasCode方法来确定位置，如果位置相同，在通过元素的equals方法来确定
		 */
		hs.add(new Person("lisi4",24));
		//hs.add(new Person("lisi4",24));
		hs.add(new Person("lisi7",27));
		hs.add(new Person("lisi1",21));
		hs.add(new Person("lisi9",29));
		hs.add(new Person("lisi7",27));
		
		Iterator it = hs.iterator();
		
		while(it.hasNext()){
			Person p = (Person)it.next();
			System.out.println(p);
		}
		
		
		
	}

}
