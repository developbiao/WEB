/**
 * @Date:2014/03/07
 * @Author:GongBiao
 * @Discribe:写一程序输出既是3、5、7整除的数
 */
package learn.base_01;

public class Demo_01 {
	
	public static void main(String[] args){
		int i = 1;
		int count = 0;
		while(i <= 1000){
			if (i % 3 == 0 && i % 5==0 && i % 7 == 0){
				count ++;
				System.out.println("第" + count + "个整除的数是: " + i);
			}
			
			i++;
		}
		System.out.println("is ok !");
	}

}
