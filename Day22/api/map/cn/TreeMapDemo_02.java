/*
 * @Discribe:HashMamp��ϰ�� �µĵ�������
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
		tm.put(new Student("������",17), "�Ĵ�");
		tm.put(new Student("ţҪ��",19), "����");
		tm.put(new Student("С�ײ�",16), "����");
		tm.put(new Student("ʯͷ",13), "ʯ��");
		tm.put(new Student("ʯͷ",13), "����");
		
		//���������ļ�д
		//��keySet()ȡ��
		Iterator<Student> it = tm.keySet().iterator();
		while(it.hasNext()){
			Student key = it.next();
			String address = tm.get(key);
			
			System.out.println(key.getName() + "------" + key.getAge() + "------" + address);
		}
		
		System.out.println(" is ok !");
	}

}

