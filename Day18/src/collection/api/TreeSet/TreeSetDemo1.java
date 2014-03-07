package collection.api.TreeSet;

import java.util.Iterator;
import java.util.TreeSet;

/*
 * TreeSet :���Ը�����֮һ��Ԫ�ؽ���ָ����ʽ����,ʹ�õ���Ȼ˳��
 * ��Ȼ˳��:����Ԫ������ľ߱��ıȽ���ʵ��Comparable�ӿڵ�compareTo����
 */
public class TreeSetDemo1 {

	public static void main(String[] args) {
		
		//TreeSet ts = new TreeSet();
		TreeSet ts = new TreeSet(new ComparatorByName());
		
		ts.add(new Person("lisi1",20));
		ts.add(new Person("lisi7",20));
		ts.add(new Person("lisi9",22));
		ts.add(new Person("lisi3",21));
		ts.add(new Person("lisi5",26));
		
		Iterator it = ts.iterator();
		
		while(it.hasNext()){
			System.out.println(it.next());
		}
		
		
		

	}

}
