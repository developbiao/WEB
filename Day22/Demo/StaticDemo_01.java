/**
 * @Discribe:��̬�ĵ������д
 * @Date:2014-01-15
 * @Author:GongBiao
 */
import java.util.ArrayList;
import java.util.List;
import java.util.Collections;
import static java.util.Collections.*;  //��̬����
import static java.lang.System.*;

class StaticDemo_01{

	public static void main(String[] args){

		List<String> list = new ArrayList<String>();
		list.add("abc1");
		list.add("abc2");
		list.add("adfdsfdsf");
		list.add("hello moto");

		sort(list);  //Collections.sort();
		System.out.println(list);

		String max = max(list);
		System.out.println(max);

		out.println("Hello my Word!");

		System.out.println("is ok !");
	}
}


/**
 * -------------------------------------
 *  ��̬����С��
 *  1����̫�����д�˳���������
 *  2����̬�����סstatic
 *  3��ע�⵼���ʱ�򷽷���ͻ
 *--------------------------------------
 /


