package api.Day19.Demo;

//多态应用练习题
public class Demo11 {
	public static void main(String[] args){
		MyFactory ft= new MyFactory();
		ft.getInst();
		for(int i=0;i<10; i++){
			ft.getInst().function();
		}

	}
}

interface MyInter{
	void function();
}

class MyFactory{   //工具类
	public MyInter getInst(){
		return new ImpleDemo2();
		
	}
}

class ImpleDemo1 implements MyInter{
	
	public void function(){
		System.out.println("使用A种数据库开发的程序");
	}
	
}

class ImpleDemo2 implements MyInter{
	public void function(){
		System.out.println("使用B种数据库开发的程序");
	}
}



