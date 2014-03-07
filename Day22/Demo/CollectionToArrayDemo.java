/**
 * @Discribe:集合转数组练习题
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

		//将集合转成数组 

		String[] arr = list.toArray(new String[list.size()]);  //new String[] 构造器指定数组的长度
		System.out.println(Arrays.toString(arr));

	
	}
}


/**
 * ---------------------------------------
 *  集合转成数组的小结
 *  使用的是Collection接口中的方法toArray方法
 *
 *  集合转数组的原因,限制对元素的操作,比如增删操作
 *  ---------------------------------------
 */


