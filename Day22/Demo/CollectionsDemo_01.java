/**
 * @Discribe:Collections 集合工具学习01
 * @Date:2014-01-14
 * @Author:GongBiao
 */
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
class CollectionsDemo_01{

	public static void main(String[] args){

		//TreeSet集合的使用工具类排序
	//	methodDemo_01();
	 	methodDemo_02();
		
	
		System.out.println("is ok !");
	}

	public static void methodDemo_01(){

	//第一个方法练习对List集合进行元素的指定方式的排序
	
	List<String> list = new ArrayList<String>();
	list.add("abcdads");
	list.add("ak47");
	list.add("joky7");
	list.add("nbs");
	list.add("lockas");
	list.add("werlil");
	list.add("youga");

	System.out.println(list);
	//排序，安照自然顺序
	Collections.sort(list);
	
	System.out.println("---------");
	System.out.println(list);
	
	//按长度排序
	Collections.sort(list,new ComparatorByLength());
	System.out.println(list);


	//集合的反转
	Collections.reverse(list);
	System.out.println("--->"+list);
	}

	//最大值，最小值max min

	public static void methodDemo_02(){
	
		List<String> list = new ArrayList<String>();
		list.add("abc11");
		list.add("just");
		list.add("hello");
		list.add("theisdo");

		String str = Collections.max(list);
		String str1 = Collections.min(list);
		System.out.println(str + ":" + str1);
		System.out.println(getMax(list));
	}


	//取集合中的最大值自定义方法
	
	public static String getMax(List<String> list){

		Iterator<String> it = list.iterator();

		String max = it.next();

		while(it.hasNext()){

			String temp = it.next();
			if(temp.compareTo(max) > 0)
				max = temp;

		}

		return max;
	
	}

}
