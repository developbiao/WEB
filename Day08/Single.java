/*
 * Practice:Single
 * Authro:Gongibo
 * Date:2013-9-16
 */

class Single
{
	
	private static Single s = new Single(); //0x0078
	private Single(){};
	public static Single getInstance()
	{
		return s;
	}
}

class SingleDemo
{
	public static void main(String[] args)
	{
		Single s1 = Single.getInstance();
		Single s2 = Single.getInstance();
		System.out.println(s1==s2);

		
	}
}
