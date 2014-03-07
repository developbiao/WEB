package api.genner;

import java.util.ArrayList;
import java.util.Iterator;

/*
 * 泛型的学习,泛型的概念
 */

public class Gennerics1 {
	public static void main(String[] args){
		
		ArrayList<String> al = new ArrayList<String>();
		al.add("abc1");
		al.add("abc2");
		al.add("abc3");
		al.add("abc4");
		//al.add(7);   //把错误交给了编译器
		
		String str;
		
		//创造一个佚代器
		Iterator<String> it = al.iterator();
		while(it.hasNext()){
			
			str = it.next();
			System.out.println("al:"+str);
		}
		
	}

}
