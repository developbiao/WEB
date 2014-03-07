/*
 * Practice :reverseArray对数组进行反转
 * Author :Gongbiao
 * Date: 2013-9-1
 */
class ArrayDemo4
{
	public static void main(String[] args)
	{
		int[]arry={6,9,12,44,21,88,77,21};
		reverseArray(arry);
		Psn(arry);
	}

	/*函数反转数组*/

	public static void reverseArray(int[] arry)
	{
		for (int start=0, end=arry.length-1; start<=end; start++,end--)	
		{
			Swap(arry,start,end);
		}
	}

	/*Swap数组的交换*/
	public static void Swap(int[] arry, int a , int b)
	{
		int temp = arry[a];
		arry[a]=arry[b];
		arry[b]=temp;
	}

	/*数组的遍历*/

	public static void Psn(int arry[])
	{
		for (int i=0; i<arry.length; i++)
		{
			System.out.print(arry[i]+"\t");
		}
		
			System.out.println();
	
	}
}
