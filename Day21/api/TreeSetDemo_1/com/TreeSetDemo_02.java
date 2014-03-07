/**
 * @Discribe:对字符串进行整体排序
 * @Date:2014-01-14
 * @Author:GongBiao
 */
package api.TreeSetDemo_1.com;

import java.util.TreeSet;
import java.util.Iterator;

import api.Generic.bean.ComparatorByLength;

public class TreeSetDemo_02 {
	
	public static void main(String[] args){
		
		TreeSet<String> t1 = new TreeSet<String>(new ComparatorByLength());
		t1.add("joks");
		t1.add("abcdefsd");
		t1.add("abcdefklkoool");
		t1.add("uiol");
		t1.add("linux is my friend");
		t1.add("java is very much");
		
		Iterator<String> it = t1.iterator();
		while(it.hasNext()){
			
			System.out.println(it.next());
		}
		
		
		System.out.println("is ok !");
	}
	

}
 