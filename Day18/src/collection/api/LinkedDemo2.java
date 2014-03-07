package collection.api;
import java.util.LinkedList;
public class LinkedDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		DuiLie d1 = new DuiLie();
		d1.MyAdd("abc1");
		d1.MyAdd("abc2");
		d1.MyAdd("abc3");
		d1.MyAdd("abc4");
		
		while(!d1.isNull()){
			System.out.println(d1.myGet());
		}

	}

}

//�Զ�������˷�װ

class DuiLie{
	private LinkedList link;
	
	public DuiLie(){
		link = new LinkedList();
	}
	
	/*
	 * ���е����Ԫ�صĹ���
	 */
	
	public void MyAdd(Object obj){
		link.addLast(obj);
	}
	
	public Object myGet(){
		
		return link.removeLast();
	}
	
	public boolean isNull(){
		return link.isEmpty();
	}
	
	
}
