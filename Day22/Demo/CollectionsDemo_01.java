/**
 * @Discribe:Collections ���Ϲ���ѧϰ01
 * @Date:2014-01-14
 * @Author:GongBiao
 */
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
class CollectionsDemo_01{

	public static void main(String[] args){

		//TreeSet���ϵ�ʹ�ù���������
	//	methodDemo_01();
	 	methodDemo_02();
		
	
		System.out.println("is ok !");
	}

	public static void methodDemo_01(){

	//��һ��������ϰ��List���Ͻ���Ԫ�ص�ָ����ʽ������
	
	List<String> list = new ArrayList<String>();
	list.add("abcdads");
	list.add("ak47");
	list.add("joky7");
	list.add("nbs");
	list.add("lockas");
	list.add("werlil");
	list.add("youga");

	System.out.println(list);
	//���򣬰�����Ȼ˳��
	Collections.sort(list);
	
	System.out.println("---------");
	System.out.println(list);
	
	//����������
	Collections.sort(list,new ComparatorByLength());
	System.out.println(list);


	//���ϵķ�ת
	Collections.reverse(list);
	System.out.println("--->"+list);
	}

	//���ֵ����Сֵmax min

	public static void methodDemo_02(){
	
		List<String> list = new ArrayList<String>();
		list.add("abc11");
		list.add("just");
		list.add("hello");
		list.add("theisdo");

		String str = Collections.max(list);
		String str1 = Collections.min(list);
		System.out.println(str + ":" + str1);
		System.out.println(getMax(list));
	}


	//ȡ�����е����ֵ�Զ��巽��
	
	public static String getMax(List<String> list){

		Iterator<String> it = list.iterator();

		String max = it.next();

		while(it.hasNext()){

			String temp = it.next();
			if(temp.compareTo(max) > 0)
				max = temp;

		}

		return max;
	
	}

}
