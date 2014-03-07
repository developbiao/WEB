/*
 * @Discribe:HashMamp练习二 新的迭代方法
 * @Date:2014-01-13
 * @Author:GongBiao
 */
package api.map.cn;

import java.util.TreeMap;

import api.bean.cn.ComparatorByName;
import api.bean.cn.Student;

import java.util.Iterator;

public class TreeMapDemo_02 {
	
	public static void main(String[] args){
		
		TreeMap<Student, String> tm = new TreeMap<Student, String>(new ComparatorByName());
		tm.put(new Student("花姑娘",17), "四川");
		tm.put(new Student("牛要飞",19), "达洲");
		tm.put(new Student("小白菜",16), "湖南");
		tm.put(new Student("石头",13), "石棉");
		tm.put(new Student("石头",13), "美罗");
		
		//迭代方法的简写
		//用keySet()取出
		Iterator<Student> it = tm.keySet().iterator();
		while(it.hasNext()){
			Student key = it.next();
			String address = tm.get(key);
			
			System.out.println(key.getName() + "------" + key.getAge() + "------" + address);
		}
		
		System.out.println(" is ok !");
	}

}

