/**
 * @Date:2014/03/05
 * @Discribe:分数的判断
 * @Author:GongBiao
 */
package learn.Demo1;

import java.util.Scanner;

public class SocresDemo_01 {
	
	public static void main(String[] args){
		
		Scanner scan = new Scanner(System.in);
		System.out.println("请输入你的成绩:");
		double socres = scan.nextDouble();
		
		if(socres > 100 || socres < 0){
			System.out.println("你的输入不正确!");
		}
		else if (socres >=90 && socres <= 100 ){
			System.out.println("你的成绩为优级A!");
		}
		else if (socres >=80 && socres < 90){
			System.out.println("你的成绩为中等B!");
		}
		else if (socres >=60 && socres < 80){
			System.out.println("你的成绩良好C!");
		}
		else{
			System.out.println("你的成绩太渣了F！");
		}
		
		scan.close();  //关闭输入流
		
		System.out.println("is ok !");
	}
	

}
