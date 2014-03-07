package ListDemo.cn;
import java.util.ArrayList;
import java.util.List;

public class ListDemo1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// ArrayList操作
		
		List list = new ArrayList();
		show(list);
		
		

	}

	public static void show(List list) {
		// TODO Auto-generated method stub
		//添加元素
		list.add("abc1");
		list.add("aba2");
		list.add("abc3");
		list.add("abc4");
		System.out.println(list);
		
		//插入元素
		list.add(1,"abc6");
		list.add(0,"abc7");
		
		//删除元素
		
		System.out.println("remove:"+list.remove(3));
		
		//修改元素
		System.out.println("set:"+list.set(3,"abcdef"));
		
		//获取元素列表
		
		System.out.println("sublist"+list.subList(3, 5));
		
		
		
	}

}
