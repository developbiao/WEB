/*3000为绳子，每天减一半，需要多少天,绳子小于五米*/
class Demo_for
{
	public static void main(String[] args)
	{
		int day = 0;
		for (int x = 3000; x>=5; x/=2)
		{
			day++;
		}

		System.out.println("需要"+day+"天!");

		int count = 0;
		int sum = 0;
		for (int i=0; i<100; i++)
		{
			if(i%2==0)
			{
				count++;
				sum+=i;	
			}
		}

		System.out.println("Count="+count+"sum="+sum);
	}
}
