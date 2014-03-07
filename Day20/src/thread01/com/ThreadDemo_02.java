package thread01.com;
/*
 * @Project:SellTicketSystem
 * @Author:Gongibao
 * @Date:2013-01-04
 * @Discribe:多线的练习题
 */
public class ThreadDemo_02 {
	
	public static void main(String[] args){
		SellTicketSystem s1 = new SellTicketSystem();
		s1.setName("长沙");
		SellTicketSystem s2 = new SellTicketSystem();
		s2.setName("成都");
		SellTicketSystem s3 = new SellTicketSystem();
		s3.setName("汉源");
		SellTicketSystem s4 = new SellTicketSystem();
		s4.setName("网上预定");
		
		
		//开启线程
		
		s1.start();
		s2.start();
		s3.start();
		s4.start();
		
		System.out.println("is ok!");
	}

}

class SellTicketSystem extends Thread{
	static int ticket = 300;
	public void run(){
		while(true){
			synchronized("lock"){
			if(ticket >=1){
				System.out.println(this.getName()+"卖出了第"+ticket-- + "张票");
			}
			}
		}
	}
}
