package ListDemo.cn;
import java.util.ArrayList;
import java.util.List;

public class ListDemo1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// ArrayList����
		
		List list = new ArrayList();
		show(list);
		
		

	}

	public static void show(List list) {
		// TODO Auto-generated method stub
		//���Ԫ��
		list.add("abc1");
		list.add("aba2");
		list.add("abc3");
		list.add("abc4");
		System.out.println(list);
		
		//����Ԫ��
		list.add(1,"abc6");
		list.add(0,"abc7");
		
		//ɾ��Ԫ��
		
		System.out.println("remove:"+list.remove(3));
		
		//�޸�Ԫ��
		System.out.println("set:"+list.set(3,"abcdef"));
		
		//��ȡԪ���б�
		
		System.out.println("sublist"+list.subList(3, 5));
		
		
		
	}

}
