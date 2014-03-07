/*
 * Pracitce:ExceptionDemo2
 * Author:Gongbiao
 * Date:2013-10-6
 */

class AException extends Exception
{

}
class BException extends Exception
{

}

class CException extends AException
{

}

/*
 * |--AExcetion
 * 	|--CExcetion
 * |--BExcetion
 */

class Fu
{
	void show() throws AException
	{}
}

class Test
{
	void method(Fu f)
	{
		try
		{
			f.show();
		}
		catch(AException e)
		{
			
		}
	}
}

class Zi extends Fu
{
	void show ()throw AExcetion  //BExcetion的异常不能
	{};
}

class ExceptionDemo2
{
	public static void main(String[] args)
	{
		Test t = new Test();
		t.method(new Zi());
	
	}
}
