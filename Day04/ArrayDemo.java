/*
 * Practice: Java数组的学习
 * Author: Gongbiao
 * Date: 2013-8-31
 */

class ArrayDemo
{
	public static void main(String[] args)
	{
		int[]arry = new int[3];
		arry[2] = 7;
		int[]arry1 = {1,3,8,9,10};
		System.out.println(arry[2]);
		System.out.println("Test is arry");
		System.out.println("Array1 list");
		for (int i=0; i<5; i++)
		{
			System.out.println("Arry1"+i+"="+arry1[i]);
		}
		
	}
}
