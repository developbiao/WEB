/**
 * @Date:2014/03/04
 * @Discribe:自定义异常练习
 * @Author:GongBiao
 */
package learn.demo2;

public class ExceptionDemo {
	
	public static void main(String[] args){
		Person p1 = new Person(230);
		int age;
		try{
		age =  p1.checkAge();
		System.out.println("Your Age is " + age);
		}catch(AgeOutBoundException e){
			System.out.println("Your are relly ?");
			e.printStackTrace();  //打印结果
		}
		System.out.println("is ok !");
	}

}
