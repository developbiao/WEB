/**
 * @Discribe System类的方法和Properties
 * @Date:2014-01-15
 * @Author:GongBiao
 */

class SystemDemo_01{

	public static void main(String[] args){

		int number = 0;
		long start_time = System.currentTimeMillis();
		long end_time;
		for(int i=0; i<1000; i++){
		
			number += i;
		}
		end_time = System.currentTimeMillis() - start_time;

		System.out.println("程序执行时间：" + end_time + "ms");

	
		System.out.println("is ok !");
	}
}
