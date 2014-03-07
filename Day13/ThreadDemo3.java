class ThreadDemo3
{
	public static void main(String[] args)
	{
		new LizeDemo();
		new LizeDemo();
		new LizeDemo();
		new LizeDemo();

		System.gc();    //  Æô¶¯À¬»ø»ØÊÕÆ÷
		
	}
}

class LizeDemo extends Object
{
	public void finalize()
	{
		System.out.println("finalize run");
	}
}
