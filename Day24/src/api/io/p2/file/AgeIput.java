/**
 * @Discribe:定义一个方法，根据参数值决定是否抛出抛出异常
 * @Author:GongBiao
 * @Date:2014/02/06
 */
package api.io.p2.file;

import api.io.bean.AgeOutBound;

public class AgeIput {
	
	public static void checkAge(int age)throws AgeOutBound{
		
		if(age >0 && age <200)
			System.out.println("right!");
		else{
			System.out.println("---------------------------");
			throw new AgeOutBound();  //抛出
		}
	}

}
