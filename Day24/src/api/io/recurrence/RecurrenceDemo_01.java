/**
 * @Discribe:�ݹ��ѧϰ_01
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
 * �ݹ���Ǻ�������������� (ֱ�ӻ��߼��)
 * 1��һ��Ҫ��������������ͻ�StackOverflowError
 * 2��һ��Ҫ�ݹ����
 */
