/**
 * @Discribe �ӿ����͵ķ���
 * @Date:2014-01-11
 * @Author:Gongibao
 */

class GenericDemo_02{

	public static void main(String[] args){
		new interImple().show("local");
		new interImple2<Integer>().show(new Integer(7));
	
		System.out.println("is ok !");
	}
}

//����һ���ӿ� 

interface inter<V>{

	public abstract void show(V v);
}

//ʵ������ӿڵĵ�һ�ַ���

class interImple implements inter<String>{

	public void show(String s){
	
		System.out.println("show :" + s);
	}
}

//�ڶ��ַ���ʵ������ӿ�
class interImple2<C> implements inter<C>{

	public void show (C c){
	
		System.out.println("show: " + c);
	}
}
