/**
 * @Discribe:Vector ��ϰ��
 * @Date:2014-01-09
 * @Author:GongBiao
 */
import java.util.Vector;
import java.util.Iterator;
import java.util.Enumeration;

class VectorDemo{

	public static void main(String[] args){

		Vector v = new Vector();
		
		v.addElement("abc1");
		v.addElement("abc2");
		v.addElement("abc3");
		v.addElement("abc4");
		v.addElement("abc5");

		//Iterator ����

		Iterator it = v.iterator();
		while(it.hasNext()){
		
			System.out.println(it.next());
		}

		System.out.println("��������������������");

		//Enmeration ����

		Enumeration en = v.elements();
		while(en.hasMoreElements()){
			System.out.println(en.nextElement());

		}	
	
		System.out.println("is ok !");
	}
}
