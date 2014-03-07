class StaticCode
{
	static  //¾²Ì¬´úÂë¿é
	{
		System.out.println("A");
	
	}

	public void show()
	{
		System.out.println("show run");
	}
}

class StaticCodeDemo
{
	static
	{
	System.out.println("B");
	}

	public static void main(String[] args)
	{
	StaticCode c = new StaticCode();
	c.show();	
		System.out.println("C");
	}
}
