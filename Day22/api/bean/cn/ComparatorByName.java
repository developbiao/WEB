/**
 * @Discribe:����һ��ѧ������Comparator�Ƚ���
 * @Date:2014-01-13
 * @Author:GongBiao
 */
package api.bean.cn;

import java.util.Comparator;

public class ComparatorByName implements Comparator{

	@Override
	public int compare(Object obj1, Object obj2) {
		//�Ƚϵ���ѧ������
		Student st1 = (Student)obj1;
		Student st2 = (Student)obj2;
		
		int temp = st1.getName().compareTo(st2.getName());
		return temp==0?st1.getAge() - st2.getAge():temp;
	}
	

}
