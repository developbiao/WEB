/*
 * @Discribe:HashMap练习
 * @Date:2014-01-13
 * @Author:GongBiao
 */
package api.map.cn;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.Iterator;

import api.bean.cn.Student;

public class HashMapDemo_01 {
	
	public static void main(String[] args){
		
		HashMap<Student, String> hm = new HashMap<Student, String>();
		hm.put(new Student("花姑娘",17), "四川");
		hm.put(new Student("牛要飞",19), "达洲");
		hm.put(new Student("小白菜",16), "湖南");
		hm.put(new Student("石头",13), "石棉");
		hm.put(new Student("石头",13), "美罗");
		
		
		//通过entry()取出元素
	
		Set<Map.Entry<Student, String>> entrySet = hm.entrySet();
		
		Iterator<Map.Entry<Student, String>> it = entrySet.iterator();
		while(it.hasNext()){
			Map.Entry<Student, String> me = it.next();
			Student stu = me.getKey();
			String address = me.getValue();
		
			System.out.println(stu.getName() + "------" + stu.getAge() + "-----" + address);
		
		
	}
		
		System.out.println("is ok !");

}
	
}
