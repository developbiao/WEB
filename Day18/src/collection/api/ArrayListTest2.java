package collection.api;
import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListTest2 {
	public static void main(String[] args){
		
		//���������
		ArrayList list = new ArrayList();
		list.add("abc1");
		list.add("abc2");
		list.add("abc3");
		list.add("abc2");
		list.add("abc3");
		
		//�����ظ�������
		
		Demo d = new Demo();
		list = d.getSingleElement(list);
		System.out.println(list);
		
	}

}

class Demo{
	private ArrayList list;
	public Demo(){
		list = new ArrayList();
	}
	
	//��Ԫ�ؽ��е���
	public ArrayList getSingleElement(ArrayList list){
		//����һ���µ�Arraylist
		ArrayList temp = new ArrayList();
		Iterator it = list.iterator();
		
		while(it.hasNext()){
			Object obj = it.next();
			if(!temp.contains(obj)){
				temp.add(obj);
			}
		}
		return temp;
	}
	
	
}
