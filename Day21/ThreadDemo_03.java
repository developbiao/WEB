/*
 *@Discrebe:线程的syn同步练习
 *@Author:Gongibao
 *@Date:2014-01-04
 */

class ThreadDemo_03{
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
			while(true){
				System.out.println("哈哈");
			}
		}
	}
}

class MyThread2 extends Thread{
	public void run(){
		synchronized("aa"){
			while(true){
				System.out.println("嘿嘿");
			}
		}
	}
}
