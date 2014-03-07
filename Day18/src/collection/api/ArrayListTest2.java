package collection.api;
import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListTest2 {
	public static void main(String[] args){
		
		//主函数入口
		ArrayList list = new ArrayList();
		list.add("abc1");
		list.add("abc2");
		list.add("abc3");
		list.add("abc2");
		list.add("abc3");
		
		//消除重复的数据
		
		Demo d = new Demo();
		list = d.getSingleElement(list);
		System.out.println(list);
		
	}

}

class Demo{
	private ArrayList list;
	public Demo(){
		list = new ArrayList();
	}
	
	//对元素进行迭代
	public ArrayList getSingleElement(ArrayList list){
		//创建一个新的Arraylist
		ArrayList temp = new ArrayList();
		Iterator it = list.iterator();
		
		while(it.hasNext()){
			Object obj = it.next();
			if(!temp.contains(obj)){
				temp.add(obj);
			}
		}
		return temp;
	}
	
	
}
