/**
 * @Discribe:自定义ComparatorByLenght 比较字符串排序
 */
package api.Generic.bean;

import java.util.Comparator;

public class ComparatorByLength implements Comparator {
	
	public int compare(Object obj1, Object obj2){
		String s1 = (String)obj1;
		String s2 = (String)obj2;
		
		int temp = s1.length() - s2.length();
		return temp==0?s1.compareTo(s2):temp;
	}

}
