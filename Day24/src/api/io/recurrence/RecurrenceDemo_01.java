/**
 * @Discribe:递归的学习_01
 * @Author:GongBiao
 * @Date:2014/02/06
 */
package api.io.recurrence;

public class RecurrenceDemo_01 {
	
	public static void main(String[] args){
		
		RecurrenceMethod_01(100);
		
		System.out.println("is ok!");
	}
	
	
	public static void RecurrenceMethod_01(int num){
		
		if(num != 0)
		{
			System.out.println(num--);
			RecurrenceMethod_01(num);
		}
		else
			return;
		
	}

}

/**
 * 递归就是函数自身调用自身 (直接或者间接)
 * 1、一定要定义条件，否则就会StackOverflowError
 * 2、一定要递归次数
 */
