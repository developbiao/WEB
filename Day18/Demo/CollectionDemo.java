/**
 * Discribe Collection  集合
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
	 *演示Collection中代码All的方法
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

		//删除元素
		//boolean b = c1.remove("abc3");

		//清空集合
		//c2.clear();
		
		//判断是不是包含一个元素

		//把c1在全部加入到c2

		//c2.addAll(c1);
		//
		//3、将c1中与c2相同的元素删除
		//c1.removeAll(c2);
		//4、将c2中与c2中不同的元素删除

		boolean b = c1.retainAll(c2); //retainAll
		
		
		System.out.println(c1);

		System.out.println(b);
	
	}
}
