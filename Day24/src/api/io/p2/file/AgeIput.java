/**
 * @Discribe:����һ�����������ݲ���ֵ�����Ƿ��׳��׳��쳣
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
			throw new AgeOutBound();  //�׳�
		}
	}

}
