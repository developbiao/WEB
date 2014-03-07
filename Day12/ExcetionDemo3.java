/*
 * Practice:Exceiton Demo3
 * Author:Gongbiao
 * Date:2013-10-6
 */

interface Inter
{
	public void show();	
}

class InterImpl implements Inter
{
	public void show()
	{
		try
		{
			throw new Exception();
		}	

		catch (Excetion e )
		{
			throw new RuntimeExcetion("xxxx“Ï≥£–≈œ¢");
		}
	}
}
