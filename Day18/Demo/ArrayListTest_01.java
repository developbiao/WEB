/**
 * @Discribe:ȥ��ArrayList�е��ظ�Ԫ��
 * @Date:2014-01-10
 * @Author:Gongbiao
 */

import java.util.ArrayList;
import java.util.Iterator;
class ArrayListTest_01{

	public static void main(String[] args){

		ArrayList<String> list = new ArrayList<String>();
		list.add("jokey");
		list.add("rose");
		list.add("jokey");
		list.add("xiaobai");
		list.add("moke");
		list.add("moke");

			System.out.println(list);
		list = getSingleElement(list);

		System.out.println("�����Ľ��:" + list);
	



	
		System.out.println("is ok !");
	}

	//ȥ���ظ�Ԫ�صķ���

	public static ArrayList getSingleElement(ArrayList list){

		ArrayList<String> temp = new ArrayList<String>();
		Iterator<String> it = list.iterator();
		while(it.hasNext()){
		
			String str = it.next();
			
			if(!temp.contains(str)){
			
				temp.add(str);
			}
		}

		return temp;
	
	}
}
