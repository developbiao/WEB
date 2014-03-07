package ListDemo.cn;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Collection;
public class ListDemo3 {
	public static void main(String[] args){
		List list = new ArrayList();
		
		
		
		list.add("abc1");
		list.add("abc2");
		list.add("abc3");
		
		//Iterator it = list.iterator();
		ListIterator it = list.listIterator();  //获取列表迭代对象
		while(it.hasNext()){
			
			Object obj = it.next();
			if(obj.equals("abc2")){
				it.set("abc7");
			}
		}
		
		System.out.println("list:"+list);
		
		
	}

}
