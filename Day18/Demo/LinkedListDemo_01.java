/**
 * @Discribe:LikedListDemo��Ϥ����
 * @Date:2014-01-09
 * @Author:GongiBiao
 */

import java.util.LinkedList;
import java.util.List;
import java.util.Iterator;
class LinkedListDemo_01{

	public static void main(String[] args){

		LinkedList<String> link = new LinkedList<String>();

		//���Ԫ��
  			
		link.addFirst("abc1");
		link.addFirst("abc2");
		link.addFirst("abc3");
		link.addFirst("abc4");
		link.addFirst("Jokey");
		link.addLast("GongBiao");
		link.addLast("Make");
		link.addLast("smallt");
		link.addFirst("youga");

		System.out.println(link);
		System.out.println(link.getFirst());

		System.out.println("����������������");
		//LinkdList ����
		while(!link.isEmpty()){  //Empty Empty Empty Empty Empty Empty
		
			System.out.println("����ɾ��>>: "+link.removeLast());
		}

		System.out.println("ɾ�����:" + link);


		
	
		System.out.println("is ok !");
	}
}
