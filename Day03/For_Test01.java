class For_Test01
{
	public static void main(String[] args)
	{
		int count = 0;
		
		wai:for (int i=0; i<5; i++)
		{
			nei:for (int j=0; j<3; j++)
			{
				if(j==2)
				{
					break nei;
				}
				count++;
			
				System.out.println("A-B-C \"So easy!\""+count);
			
			}
			
			System.out.println("OK glass!");
		}

	}
}
