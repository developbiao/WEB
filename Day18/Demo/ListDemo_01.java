/**
 * @Discribe:ListDemo list������ϰ01
 * @Date:2014-01-09
 * @Author:GongBiao
 */

import java.util.List;
import java.util.ArrayList;
import java.util.Iterator;

class ListDemo_01{

	public static void main(String[] args){

		List<String> lst = new ArrayList<String>();
		ListDemo(lst);

		
	
	}

	public static void ListDemo(List<String> lst){
	
		lst.add("gongibao");
		lst.add("jokey");
		lst.add("veCoffee");
		lst.add("tom");

		//������е�Ԫ��
		//lst.clear();

		//set�޸�����Ԫ��

		lst.set(0,"mike");


		System.out.println(lst);
		
		//get��ȡָ��λ���ϵ�Ԫ��

		System.out.println(lst.get(3));

		//��ȡ���б�

		System.out.println(lst.subList(1,3));
	}
}
