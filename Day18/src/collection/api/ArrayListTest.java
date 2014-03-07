package collection.api;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListTest {

	public static void main(String[] args) {
		/*
		 * 定义一个功能，去除ArrayList中的重复元素
		 * 
		 * 
		 */
		
		ArrayList al = new ArrayList();
		al.add("abc1");
		al.add("abc2");
		al.add("abc1");
		al.add("abc2");
		al.add("abc1");
		
		System.out.println(al);
		
		al = getSingleElementList(al);
		
		System.out.println("Single:"+al);
		
		System.out.println("loading is ok !");

	}

	public static ArrayList getSingleElementList(ArrayList al) {
		// 1、创建一个新的容器
		ArrayList temp = new ArrayList();
		
		//迭代原来的元素
		Iterator it = al.iterator();
		while(it.hasNext()){
			Object obj = it.next();
			if(!temp.contains(obj)){
				temp.add(obj);
				
			}
		}
		return temp;
	}

}
