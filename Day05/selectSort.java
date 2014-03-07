/*
 * Practice: 练习SelectSort
 * Author:Gongbiao
 * Date:2013-9-1
 */

class ArrayDemo2
{
	public static void main(String[] args)
	{
		int[] arry = {77,22,89,42,92,12,82,21,12,27,19,72,11,18,5};	

		//调用排序结果
		selectSort(arry);
		//遍历输出
		for (int i=0; i<arry.length; i++)
		{
			if (i!=arry.length-1)
			System.out.print(arry[i]+",");
			else
			System.out.println(arry[i]);

		}
		System.out.println("Print is Over!");
	}

	/*SelectSort选择排序*/
	public static void selectSort(int[] arry)
	{
		int swap;
		for (int i=0; i<arry.length-1; i++)
		{
			for (int j=i+1; j<arry.length; j++)
			{
				if (arry[i]>arry[j])
				{
					swap = arry[i];
					arry[i] = arry[j];
					arry[j] = swap;		
				}
			}
		}	
	}
}
