package collection.api;
import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListDemo3 {
	
	public static void main(String[] args){
		
		//主数入口
		ArrayList al = new ArrayList();
		al.add(new Person("lisi1",21));
		al.add(new Person("lisi2",22));
		al.add(new Person("lisi1",21));
		al.add(new Person("lisi2",22));
		al.add(new Person("lisi3",23));
		al.add(new Person("lisi1",21));
		
		al = getSingleElementList(al);
		System.out.println(al);
	
	}
	  /*
	   * 肖除函数的重复元素
	   */

	public static ArrayList getSingleElementList(ArrayList al) {
		ArrayList temp = new ArrayList();
		Iterator it = al.iterator();
		while(it.hasNext()){
			Object obj  = it.next();
			if(!temp.contains(obj))
				temp.add(obj);
		}
		return temp;
	}
	

}
