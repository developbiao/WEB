/*
 * @Discribe:HashMap��ϰ
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
		hm.put(new Student("������",17), "�Ĵ�");
		hm.put(new Student("ţҪ��",19), "����");
		hm.put(new Student("С�ײ�",16), "����");
		hm.put(new Student("ʯͷ",13), "ʯ��");
		hm.put(new Student("ʯͷ",13), "����");
		
		
		//ͨ��entry()ȡ��Ԫ��
	
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
