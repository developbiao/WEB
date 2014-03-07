package collection.api.TreeSet;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListTest1 {
	public static void main(String[] args){
		
		ArrayList al = new ArrayList();
		al.add(new Person("lisi1",21));
		al.add(new Person("lisi2",22));
		al.add(new Person("lisi2",22));
		al.add(new Person("lisi3",23));
		al.add(new Person("lisi4",28));
		
		System.out.println("al"+al);  
		
		al = getElementList(al);
		
		System.out.println("al:"+al);
		System.out.println();
	}
	
	public static ArrayList getElementList(ArrayList al){
		// 1������һ���¼���
		ArrayList temp = new ArrayList();
		
		//2������һ��������
		Iterator it = al.iterator();
		while(it.hasNext()){
			Object obj =it.next();
			if(!temp.contains(obj)){  //contains�ڲ�����equals����
				temp.add(obj);
			}
		}
		
		return temp;
		
		
	}

}
