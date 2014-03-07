/**
 * @Discribe:随机数的练习
 * @Date:2014/01/20
 * @Author:GongBiao
 */
import java.util.Random;

class RandomDemo{

	public static void main(String[] args){

		double number1 = Math.ceil((Math.random() * 10));  //可以通过Math.random()来调用
		double number2 = Math.floor((Math.random() * 10 + 1));
		System.out.println(number1);   //每一次的结果都不一样 
		System.out.println(number2);

		//使用随机数对象

		System.out.println("------------------");
	
		Random r = new Random();
		for(int i=0; i<10; i++){
			int num = r.nextInt(10) + 1;
			System.out.println(num);
		
		}
		System.out.println("is ok !");
	}
}
