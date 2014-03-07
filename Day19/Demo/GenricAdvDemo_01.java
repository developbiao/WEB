/**
 * @Discribe: 泛型不明确的时候使用通配符"?" 
 * @Date:2014-01-11
 * @Author:GongBiao
 */

import java.util.ArrayList;
import java.util.Iterator;
class GenericAdvDemo_01{

	public static void main(String[] args){

		ArrayList<Integer> list1 = new ArrayList<Integer>();
		list1.add(new Integer(8));
		list1.add(new Integer(9));
		list1.add(new Integer(10));
		list1.add(new Integer(7));
		list1.add(new Integer(11));

		ArrayList<String> list2 = new ArrayList<String>();
		list2.add("abc1");
		list2.add("abc2");
		list2.add("abc3");
		list2.add("abc5");

		IterPrintf(list1);

		System.out.println("——————");

		IterPrintf(list2);

	
		System.out.println("is ok !");
	}


	//迭代方法
	//
	//什么对象都能打印
	public static void IterPrintf(ArrayList<?> list){

		Iterator<?> it = list.iterator();
		while(it.hasNext()){
		
			System.out.println(it.next());
		}
	
	}
}

