/**
 * @Discribe:����ת������ϰ��
 * @Date:2014-01-15
 * @Author:GongBiao
 */
import java.util.ArrayList;
import java.util.List;
import java.util.Collections;
import java.util.Arrays;

class CollectionToArrayDemo{

	public static void main(String[] args){

		List<String> list = new ArrayList<String>();
		list.add("abc1");
		list.add("abc2");
		list.add("abc3");
		list.add("abc4");
		list.add("abc5");
		list.add("abc6");

		//������ת������ 

		String[] arr = list.toArray(new String[list.size()]);  //new String[] ������ָ������ĳ���
		System.out.println(Arrays.toString(arr));

	
	}
}


/**
 * ---------------------------------------
 *  ����ת�������С��
 *  ʹ�õ���Collection�ӿ��еķ���toArray����
 *
 *  ����ת�����ԭ��,���ƶ�Ԫ�صĲ���,������ɾ����
 *  ---------------------------------------
 */


