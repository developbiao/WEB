/*
 * @Author:Gongbiao
 * @Date:2014-1-4
 * @Discribe:线程的壮态练习 getState()
 */
class ThreadDemo_02{
	public static void main(String[] args){
		

		MyThread t1 = new MyThread();
		MyThread2 t2 = new MyThread2(t1);
		
		t2.start();
		t1.start();

		System.out.println("this is ok!");
	}
}

class MyThread extends Thread{
	

	public void run(){
		System.out.println("run1.....>>:" + this.getState());
	}

}

class MyThread2 extends Thread{
	MyThread t;
	public MyThread2(MyThread t){
		this.t = t;
	}

	public void run(){
		
		while(true){
			System.out.println("run2...>>:" + this.getState() + " \trun1....的壮态:" + t.getState());
		}
	}
}
