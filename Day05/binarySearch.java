/*
 * Projec:java������ϰ���ַ�
 * Author:Gongbiao
 * Date: 2013-9-1
 * */

class ArrayDemo3
{
	public static void main(String[] args)
	{
		int[] arry={13,17,33,37,49,66,78,97};	
		int key = BinarySearch(arry, 33);  //key����λ��
		Psn(arry);
		System.out.println("key="+key); //��ӡkey�Ľű�

		System.out.println("Inderx,Insert");
	        int num = IndexInsert(arry,99);
		System.out.println("Index="+num);

		//Psn(arry);


	}

	/*��������*/
	public static void Psn(int[] arry)
	{
		for (int i=0; i<arry.length; i++)
		{
			System.out.print(arry[i]+"\t");
		}
	}

	/*���ֲ���*/
	public static int BinarySearch(int[] arry, int key)
	{
		int min = 0;
	        int max = arry.length-1;
		int mid;

		while(max>=min) 	//��Ҫ�о���Ͳ���
		{
			//��ȡ�м�ֵ
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

	/*�������б��в���Ԫ��*/
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
