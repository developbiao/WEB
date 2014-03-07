/**
 * @Discribe 接口类型的泛型
 * @Date:2014-01-11
 * @Author:Gongibao
 */

class GenericDemo_02{

	public static void main(String[] args){
		new interImple().show("local");
		new interImple2<Integer>().show(new Integer(7));
	
		System.out.println("is ok !");
	}
}

//定义一个接口 

interface inter<V>{

	public abstract void show(V v);
}

//实现这个接口的第一种方法

class interImple implements inter<String>{

	public void show(String s){
	
		System.out.println("show :" + s);
	}
}

//第二种方法实现这个接口
class interImple2<C> implements inter<C>{

	public void show (C c){
	
		System.out.println("show: " + c);
	}
}
