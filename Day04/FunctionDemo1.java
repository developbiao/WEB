/* ������ѧϰ*/
class FunctionDemo1
{
	/*�žų˷�����*/
	public static void Print99()
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

	/*�ж����*/

	public static boolean Equals(int a, int b)
	{
		return a==b;	
	}

	public static int getMax(int a, int b, int c)
	{
		if (a>b&&a>c)
			return a;	
		else if(b>a&&b>c)
			return b;
		else
			return c;
	}	

	public static void main(String[] args)
	{
	//	Print99();	
	 	int var1 = 35 , var2 = 35, var3 = 77;
		boolean flag = Equals(var1,var2);
		if(flag)
		{
			System.out.println("�����������!");
		}
		else
		{
			System.out.println("�������������");
		}

	 	int max = getMax(21, 88, 11);
		System.out.println("max="+max);


		
		System.out.println("is Over!");

	}


}
