/*
 * Practice: 十进制转十六进制
 * Author:Gongbiao
 * Date:2013-9-2
 */
class ArrayTest6
{
	public static void main(String[] args)
	{
		toHex2(60);
		System.out.println();
		System.out.println("PRINT IS OVER!");
		
	}

	/*思路1 To Hex 函数*/
	public static void toHex1(int num)
	{
		for (int x=0; x<8; x++)
		{
			int temp = num & 15;
			if (temp >9)
			{
				System.out.println((char)(temp-10+'A'));	//对应的ASCII码
			}
			else
			{
				System.out.println((char)(temp+'0'));	//对应的的ASCII码(0-9)-[48-57]
			}

			num = num >>> 4; 	//进下次取高们的右移操作
		}
	}

	/*思路2 To Hex 函数*/

	public static void toHex2(int num)
	{
		//定义一个char类型的数组来存储每次获取到的值
		char [] chs = new char[8];
		int pos = chs.length;
		while(num!=0)
		{
			pos--;
			int temp = num & 15;
			if (temp >9)
			{
				chs[pos] = (char) (temp-10+'A');
			}
			else
			{
				chs[pos] = (char)(temp+'0');
			}
			
			num = num >>>4; 	//位移
		}

		System.out.println("pos="+pos);  //打印移动的次数

		//打印数组内容
		for (int i=pos; i<chs.length; i++)
		{
			System.out.print(chs[i]);
		}

	}

	/*思路3查表法*/
	public static void toHex3(int num)
	{
		//定义一个char类型的数组来存储每次获取到的值
		char [] chs = new char[8];
		int pos = chs.length;
		//定义一个表
		char[] arry={'1', '2' ,'3', '4',
		            '5', '6', '7', '8',
			    '9', 'A', 'B', 'C','D', 'E', 'F'};
		while(num!=0)
		{
			//用脚标查找支对应的元素，查表法	
			
			chs[--pos] = arry[--pos];


			num = num >>>4; 	//位移
		}

		System.out.println("pos="+pos);  //打印移动的次数

		//打印数组内容
		for (int i=pos; i<chs.length; i++)
		{
			System.out.print(chs[i]);
		}

	}

	
}

/*——————————————————————————*/
/* 总结:进制转换就是有的位移的思路，查表法		      */
/*——————————————————————————*/

