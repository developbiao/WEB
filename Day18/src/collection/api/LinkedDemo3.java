package collection.api;
import java.util.LinkedList;
public class LinkedDemo3 {
	public void main(String[] args){
		
		//主函数入口
		Duiz dui = new Duiz();
		dui.MyAdd("abc1");
		dui.MyAdd("abc2");
		dui.MyAdd("abc3");
		dui.MyAdd("abc4");
		
		//堆的操作取出元素
		while(!dui.isNull()){
			System.out.println(dui.GetEle());
		}
		
	}
}

//自己来对对象进行一个封装

class Duiz{
	private LinkedList link;
	
	public Duiz(){
		link = new LinkedList();
	}
	
	/*
	 * 添加元素操作
	 */
	public void MyAdd(Object obj){
		link.add(obj);
	}
	
	//判断元素是不是为空
	
	public boolean isNull(){
		return link.isEmpty();
	}
	
	//获取元素操作
	
	public Object GetEle(){
		
		return link.removeLast();
	}
	
}
