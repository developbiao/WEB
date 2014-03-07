/*
 * Java Test 99  ³Ë·¨±í
 * Author:Gongbiao
 * Date:2013-8-30
 */
class ForTest99
{
	public static void main(String[] args)
	{
		for (int i=1; i<=9; i++)
		{
			for (int j=1; j<=i; j++)
			{
				System.out.print(j+"*"+i+"="+j*i+"\t");
			}
			System.out.println();
		}
	}
}
