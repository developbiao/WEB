/**
 * @Date:2014/03/05
 * @Discribe:�������ж�
 * @Author:GongBiao
 */
package learn.Demo1;

import java.util.Scanner;

public class SocresDemo_01 {
	
	public static void main(String[] args){
		
		Scanner scan = new Scanner(System.in);
		System.out.println("��������ĳɼ�:");
		double socres = scan.nextDouble();
		
		if(socres > 100 || socres < 0){
			System.out.println("������벻��ȷ!");
		}
		else if (socres >=90 && socres <= 100 ){
			System.out.println("��ĳɼ�Ϊ�ż�A!");
		}
		else if (socres >=80 && socres < 90){
			System.out.println("��ĳɼ�Ϊ�е�B!");
		}
		else if (socres >=60 && socres < 80){
			System.out.println("��ĳɼ�����C!");
		}
		else{
			System.out.println("��ĳɼ�̫����F��");
		}
		
		scan.close();  //�ر�������
		
		System.out.println("is ok !");
	}
	

}
