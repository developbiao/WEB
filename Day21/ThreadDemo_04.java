/**
 * @Discurbe:这是一个死锁的练习
 * @Date:2014-01-04
 * @Author:Gongibao
 */
class  ThreadDemo_04{
	public static void main(String[] args){

		MyThread t1 = new MyThread();
		MyThread2 t2 = new MyThread2();

		t1.start();
		t2.start();
	
		System.out.println("is ok !");
	}

}

class MyThread extends Thread{

	public void run(){
		synchronized("aa"){
			try{
				Thread.sleep(1500);
			}catch(Exception e){}
			synchronized("bb"){
				System.out.println("aabb");
			}
		}
	}

}

class MyThread2 extends Thread{

	public void run(){
		synchronized("bb"){
			try{
				Thread.sleep(1500);
			}catch(Exception e){}
			synchronized("aa"){
				System.out.println("bbaa");
			}
		}
	}
}
