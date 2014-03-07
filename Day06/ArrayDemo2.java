/*
 * Practice: Java中二维数组的应用
 * Author: Gongbiao
 * Date: 2013-9-2
 */

class ArrayDemo2
{
	public static void main(String[] args)
	{
		int[][]arry={
			{15,22,44,77,88},
			{17,88,99,21,33},
			{77,22,11,37,49},
			{21,77,21,24,25},
		};

		int sum = 0;
		int avager;

		//求总额
		for (int i=0; i<arry.length; i++)
		{
			for (int j=0; j<arry[i].length; j++)
			{
				sum+= arry[i][j];	
			}
			
		}
		avager = sum /arry.length;

		System.out.println("sum="+sum);
		System.out.println("Avager="+avager);
	}
}
