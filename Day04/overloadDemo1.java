/*OVER LOAD METHOD 函数的重载*/
class overLoad
{
	/*Print99*/
	public static void Print99(int var)
	{
		if (var >= 10)
			return ;
		for (int i=1; i<=var; i++)
		{
			for (int j=1; j<=i; j++)
			{
				System.out.print(j+"*"+i+"="+j*i+"\t");
			}
			
			System.out.println();
		}
	}

	/*static Print99*/
	public static void Print99()
	{
		Print99(9);   //打印固定格式
	}


	public static void main(String[] args)
	{
		Print99(6);	
	}
	
}
