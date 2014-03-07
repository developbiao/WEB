package collection.api;
import java.util.Iterator;
import java.util.LinkedList;

public class LinkedisDemo {
	//Linked is Demo 演示
	
	public static void main(String[] args){
		
		LinkedList link = new LinkedList();
		
		link.addFirst("abc1");
		link.addFirst("abc2");
		link.addFirst("abc3");
		
		
		//System.out.println(link);
//		System.out.println("link First:"+link.getFirst());
//		System.out.println("link Last:"+link.getLast());
		
//		System.out.println(link.removeFirst());    //获取第一个但是会删除
//		System.out.println(link.removeLast());  //获取最后一个元素但是会删除
		
		//LinkedList 中使用Iterator
		
		Iterator it = link.iterator();
		while(it.hasNext()){
			System.out.println(it.next());
		}
		
		
		
		
		
	}

}
