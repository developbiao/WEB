/**
 * @Discribe: 自定义一个比较器跟据Person的姓名进行比较
 * @Date:2014-01-12
 * @Author:GongBiao
 */
package api.Generic.bean;

import java.util.Comparator;

public class ComparatorByName extends Object implements Comparator {
	
	public int compare(Object obj1, Object obj2){
		Person p1 = (Person) obj1;
		Person p2 = (Person) obj2;
		
		int temp = p1.getName().compareTo(p2.getName());
		return temp==0?p1.getAge() - p2.getAge():temp;
	}

}
