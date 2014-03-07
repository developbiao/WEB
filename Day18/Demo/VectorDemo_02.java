/**
 * @Discribe: Vector 的迭代方法练习02
 * @Date:2014-01-09
 * @Author:GongBiao
 */

import java.util.Enumeration;
import java.util.Vector;
class VectorDemo_02{

	public static void main(String[] args){

		Vector v = new Vector();
		v.addElement("abc1");
		v.addElement("abc2");
		v.addElement("abc3");
		v.addElement("abc4");
		v.addElement("abc5");

		Enumeration en = v.elements();
		while(en.hasMoreElements()){
		
			System.out.println(en.nextElement());
		}
	
		System.out.println("is ok !");
	}
}
