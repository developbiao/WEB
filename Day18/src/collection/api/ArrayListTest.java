package collection.api;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListTest {

	public static void main(String[] args) {
		/*
		 * ����һ�����ܣ�ȥ��ArrayList�е��ظ�Ԫ��
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
		// 1������һ���µ�����
		ArrayList temp = new ArrayList();
		
		//����ԭ����Ԫ��
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
