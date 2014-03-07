/*
 * Projec:java数组练习二分法
 * Author:Gongbiao
 * Date: 2013-9-1
 * */

class ArrayDemo3
{
	public static void main(String[] args)
	{
		int[] arry={13,17,33,37,49,66,78,97};	
		int key = BinarySearch(arry, 33);  //key所在位置
		Psn(arry);
		System.out.println("key="+key); //打印key的脚标

		System.out.println("Inderx,Insert");
	        int num = IndexInsert(arry,99);
		System.out.println("Index="+num);

		//Psn(arry);


	}

	/*遍历数组*/
	public static void Psn(int[] arry)
	{
		for (int i=0; i<arry.length; i++)
		{
			System.out.print(arry[i]+"\t");
		}
	}

	/*二分查找*/
	public static int BinarySearch(int[] arry, int key)
	{
		int min = 0;
	        int max = arry.length-1;
		int mid;

		while(max>=min) 	//中要有距离就查找
		{
			//获取中间值
			mid = (min + max)>>1;
			if (key > arry[mid])
			{
				min = ++mid;
			}
			else if (key < arry[mid])
			{
				max = --mid;
			}
			else
			{
				return mid;
			}

		}

		return -1;

	}

	/*在有序列表中插入元素*/
	public static int IndexInsert(int[]arry,int value)
	{
		int min,max,mid;
		min = 0;
		max = arry.length-1;	

		while(max>=min)
		{
			mid = (max + min)>>1;
			if(value >arry[mid])
			{
				min = ++mid;
			}
			else if(value<arry[mid])
			{
				max = --mid;
			}

			else
			{
				//	 arry[mid] = value;
				return mid;
			}

		}

		//arry[min] = value;
		return min;
	}
}
