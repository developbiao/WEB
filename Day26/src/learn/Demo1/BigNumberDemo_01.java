/**
 * @Date:2014/03/05
 * @Discribe:Compare Big nubmer
 * @Author:GongBiao
 */
package learn.Demo1;

import java.util.Scanner;

public class BigNumberDemo_01 {
	
	public static void main(String[] args){
		
		Scanner scan = new Scanner(System.in);
		int x = scan.nextInt();
		int y = scan.nextInt();
		int z = scan.nextInt();
		int max;
		
		if(x > y && x > z){
			max = x;
		}
		else if (y > z){
			max = y;
		}
		else{
			max = z;
		}
		
		System.out.println("Max: " + max);
		
		System.out.println("is ok !");
	}

}
