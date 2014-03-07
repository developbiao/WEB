/*
 * Practice: 查找数组中的最大的数
 * Author: Gongbiao
 * Date:2013-9-1
 */
class ArrayDemo1
{
	public static void main(String[] args)
	{
		int[]arry = new int []{3,13,77,99,11,8,16,300};	
		Pos(arry);
		int max = getMax(arry);
		System.out.println("Max="+max+"");
		System.out.println("PRINT OVER!");
		
	}

	/*遍历数组*/
	public static void Pos(int arry[])
	{
		
		for (int i=0; i<arry.length; i++)
		{
			if (i!=arry.length-1)
				System.out.print("arry["+i+"]="+arry[i]+"\t");
			else
				System.out.println("arry["+i+"]="+arry[i]+"");
		}
	}

	/*查找最值的数*/
	public static int getMax(int arry[])
	{
		int max = arry[0];
		for (int i=1; i<arry.length; i++)
		{
			if (arry[i]>max)
			{
				max = arry[i];
			}
		}

		return max;
	}
}

