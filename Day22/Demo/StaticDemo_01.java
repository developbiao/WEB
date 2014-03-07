/**
 * @Discribe:静态的导入简化书写
 * @Date:2014-01-15
 * @Author:GongBiao
 */
import java.util.ArrayList;
import java.util.List;
import java.util.Collections;
import static java.util.Collections.*;  //静态导入
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
 *  静态导入小结
 *  1、表太导入简写了长的引用名
 *  2、静态导入记住static
 *  3、注意导入的时候方法冲突
 *--------------------------------------
 /


