package collection.api;
import java.util.Iterator;
import java.util.LinkedList;

public class LinkedisDemo {
	//Linked is Demo ��ʾ
	
	public static void main(String[] args){
		
		LinkedList link = new LinkedList();
		
		link.addFirst("abc1");
		link.addFirst("abc2");
		link.addFirst("abc3");
		
		
		//System.out.println(link);
//		System.out.println("link First:"+link.getFirst());
//		System.out.println("link Last:"+link.getLast());
		
//		System.out.println(link.removeFirst());    //��ȡ��һ�����ǻ�ɾ��
//		System.out.println(link.removeLast());  //��ȡ���һ��Ԫ�ص��ǻ�ɾ��
		
		//LinkedList ��ʹ��Iterator
		
		Iterator it = link.iterator();
		while(it.hasNext()){
			System.out.println(it.next());
		}
		
		
		
		
		
	}

}
