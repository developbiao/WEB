package thread01.com;

public class ThreadDemo_01 {
	
	public static void main(String[] args){
		MyThread t1 = new MyThread();
		t1.setName("线路1");
		t1.start();
		
		MyThread3 t2 = new MyThread3();
		Thread t3 = new Thread(t2);
		t3.setName("线路2");
		t3.start();
		
		
		System.out.println("is ok!");
	}

}

class MyThread extends Thread{
	public void run(){
		for(int i=0; i<100; i++){
			System.out.println(this.getName()+"-----" + i);
		}
	}
}

//第二种方法的实现 

class MyThread3 implements Runnable{
	
	public void run(){
		for(int i=0; i<100; i++){
			System.out.println("------>>" + i );
		
		}
	}
	
}