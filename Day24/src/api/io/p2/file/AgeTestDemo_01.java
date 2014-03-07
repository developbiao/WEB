/**
 * @Discribe:≤‚ ‘¿‡
 * @Author:GongBiao
 * @Date:2014/02/06
 */
package api.io.p2.file;

import api.io.bean.AgeOutBound;

public class AgeTestDemo_01 {
	
	public static void main(String[] args){
		int age = 1000;
		try{
			AgeIput.checkAge(age);
		}catch(AgeOutBound e){
			System.out.println("Are you relly :" + age + "years old?");
			e.printStackTrace();
		}
		
		System.out.println("is ok !");
	}

}
