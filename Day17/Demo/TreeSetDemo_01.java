/**
 * @Discribe:TreeSet集合的学习
 * @Date:2014-01-08
 * @Author:Gongbiao
 */

import java.util.List;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.TreeSet;
import java.util.Comparator;
import java.util.Collections;

class TreeSetDemo_01{

	public static void main(String[] args){

		/*

		List lst = new ArrayList();

		lst.add(new Integer(42));
		lst.add(44);
		lst.add(77);
		lst.add(88);
		lst.add(79);
		lst.add(18);
		lst.add(179);

		System.out.println(lst);

		//Coolections.sort排序
		Collections.sort(lst);
	
		System.out.println(lst);
		
		//Collections.reverse();

		Collections.reverse(lst);
		System.out.println(lst);

		System.out.println("——————————");
		*/
	
		//顺序表表结构的指针跟踪

		List <Integer>lst = new ArrayList<Integer>();
		lst.add(111);
		lst.add(110);
		lst.add(119);
		lst.add(170);
		lst.add(1973);
		lst.add(1993);

		//通常用的方法
		/*
		for(int i=0; i<lst.size(); i++){
		
			if(lst.get(i)==170){
				System.out.println(lst.get(i-3));
			}
		}

	  	*/	


		//Iterator用的方法找引入了跟踪指针

		Iterator it = lst.iterator();
		Iterator is = lst.iterator();

		int count = 0;   
		
		while(it.hasNext()){

			Object obj = it.next(); 
			count++;
			if(count > 3){
			
				Object obj2 = is.next();
				if(obj.equals(new Integer(170))){
					System.out.println(obj2);
				}

			}
		}


		System.out.println("is ok !");
	}
}
