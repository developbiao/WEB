/**
 * @Date:2014/03/04  22:16
 * @Discribe:自定义异常练习02  
 * @Author:GongBiao
 */
package learn.demo3;

public class ExceptionDemo2 {
	
	public static void main(String[] args){
		
		Compted com = new Compted();
		try{
		int nubmer =  com.Method(44, 0);
		}catch (MyException e){
			e.printStackTrace();
		} finally{
			System.out.println("程序执行完成!");
		}
		System.out.println("is ok !");
	}

}
