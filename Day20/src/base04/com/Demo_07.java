package base04.com;

public class Demo_07 {
	
	public static void main(String[] args){
		//异常的出现出现时机
		
	
		
		Demo_07 d = new Demo_07();
		//1、异常的应用
		try{
			d.one(0, 0);
		}catch(AandBIsZeroException e){
			System.out.println("一元一次方程有无数个解");
		}catch(AIsZeroException e){
			System.out.println("一元一次方程有无数个实数解");
		}
		
		System.out.println("is ok!");
	}
	
	void one(int a, int b){
		if(a==0 && b==0){
			throw new AandBIsZeroException();
			
		}
		
		if(a==0){
			throw new AIsZeroException();
		}
		
		System.out.println("结果是:" + -a/b);
	}

}

//自定义异常类
class AandBIsZeroException extends RuntimeException{
	
}

class  AIsZeroException extends RuntimeException{
	
}

