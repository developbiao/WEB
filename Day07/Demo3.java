class Factorial
{
	public static void main(String[] args)
	{
		long limit = 20;
		long factorial = 1;

		for (int i = 1; i <= limit; i++)
		{
			factorial = 1;
			for (int factor = 2; factor <= i; factor++)
			{
				factorial *= factor;
			}

			System.out.println(i + " ! "+ " is " + factorial);
		}

	}
}
