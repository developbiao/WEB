package collection.api;
import java.util.LinkedList;
public class LinkedDemo3 {
	public void main(String[] args){
		
		//���������
		Duiz dui = new Duiz();
		dui.MyAdd("abc1");
		dui.MyAdd("abc2");
		dui.MyAdd("abc3");
		dui.MyAdd("abc4");
		
		//�ѵĲ���ȡ��Ԫ��
		while(!dui.isNull()){
			System.out.println(dui.GetEle());
		}
		
	}
}

//�Լ����Զ������һ����װ

class Duiz{
	private LinkedList link;
	
	public Duiz(){
		link = new LinkedList();
	}
	
	/*
	 * ���Ԫ�ز���
	 */
	public void MyAdd(Object obj){
		link.add(obj);
	}
	
	//�ж�Ԫ���ǲ���Ϊ��
	
	public boolean isNull(){
		return link.isEmpty();
	}
	
	//��ȡԪ�ز���
	
	public Object GetEle(){
		
		return link.removeLast();
	}
	
}
