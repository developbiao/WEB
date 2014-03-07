/**
 * @Discribe:ListDemo list集合练习01
 * @Date:2014-01-09
 * @Author:GongBiao
 */

import java.util.List;
import java.util.ArrayList;
import java.util.Iterator;

class ListDemo_01{

	public static void main(String[] args){

		List<String> lst = new ArrayList<String>();
		ListDemo(lst);

		
	
	}

	public static void ListDemo(List<String> lst){
	
		lst.add("gongibao");
		lst.add("jokey");
		lst.add("veCoffee");
		lst.add("tom");

		//清除所有的元素
		//lst.clear();

		//set修改批定元素

		lst.set(0,"mike");


		System.out.println(lst);
		
		//get获取指定位置上的元素

		System.out.println(lst.get(3));

		//获取子列表

		System.out.println(lst.subList(1,3));
	}
}
