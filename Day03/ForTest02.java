/*
 * Project:Java输出菱形
 * Author:Gongbiao
 * Date:2013-8-30
 */
class ForTest02
{
	public static void main(String[] args)
	{
		/*上半部分*/
		for (int i =1; i<=5; i++)//控制行
		{
			for (int j=1; j<=5-i; j++)
			{
				System.out.print(" ");  //控制空格
			}

			for (int k=1; k<=i*2-1; k++)
			{
				System.out.print("*");
			}

			System.out.println();

		
		}

		/*下半部分的控制*/
		for (int i=1; i<=5; i++)
		{
			for (int j=1; j<=i; j++)
			{
				System.out.print(" ");
			}

			for (int k = 1; k <=(5*2-1)-i*2; k++)
			{
				System.out.print("*");
			}

			System.out.println();

		}

	}
}
