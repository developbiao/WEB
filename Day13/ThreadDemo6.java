/*
 * Practice:¶àÏß³ÌÂôÆ±Á·Ï°
 */

class Ticket extends Thread
{
	private static int tiket = 100;
	private int count = 0;;

	public void run()
	{

		while(true)
		{
			if(tiket>0)
			{
				System.out.println("Ticket"+Thread.currentThread().getName()+"----"+tiket--);	
			}
			else
				break;
		}

	}

		
	

	
}

class TicketDemo
{
	public static void main(String[] args)
	{

		Ticket t1 = new Ticket();
		Ticket t2 = new Ticket();
		Ticket t3 = new Ticket();
		Ticket t4 = new Ticket();

		t1.start();
		t2.start();
		t3.start();
		t4.start();

		t1.sop();

	
	}
}
