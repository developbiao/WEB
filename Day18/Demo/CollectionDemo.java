/**
 * Discribe Collection  ����
 * Date:2014-01-09
 * @Author:GongBiao
 */
import java.util.Collection;
import java.util.ArrayList;
class CollectionDemo{

	public static void main(String[] args){

		
		Collection c1 = new ArrayList();
		Collection c2 = new ArrayList();

		collectionAllDemo(c1,c2);
	
		System.out.println("is ok !");
	}


	/**
	 *��ʾCollection�д���All�ķ���
	 *@prame 
	 */

    	public static void collectionAllDemo(Collection c1, Collection c2){

		c1.add("abc1");
		c1.add("abc2");
		c1.add("abc3");
		c1.add("abc4");
		c1.add("abc5");

		c2.add("abc3");
		c2.add("abc4");
		c2.add("abc7");

		System.out.println(c1);

		//ɾ��Ԫ��
		//boolean b = c1.remove("abc3");

		//��ռ���
		//c2.clear();
		
		//�ж��ǲ��ǰ���һ��Ԫ��

		//��c1��ȫ�����뵽c2

		//c2.addAll(c1);
		//
		//3����c1����c2��ͬ��Ԫ��ɾ��
		//c1.removeAll(c2);
		//4����c2����c2�в�ͬ��Ԫ��ɾ��

		boolean b = c1.retainAll(c2); //retainAll
		
		
		System.out.println(c1);

		System.out.println(b);
	
	}
}
