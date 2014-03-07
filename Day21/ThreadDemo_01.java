class ThreadDemo_01{
	public static void main(String[] args){
		//线程状态

		MyThread2 t2 = new MyThread2();
		MyThread mt = new MyThread(t2);
		//当前还未启动——叫做new状态
		mt.start();
		t2.start();
		
		System.out.println("is ok!");
	}
}

class MyThread extends Thread{
	MyThread2 t;
	public MyThread(MyThread2 t){
		this.t = t;
	}
	public void run(){
		System.out.println("run1当前壮态: " + this.getState() + "run2的当前壮态:" + t.getState());
	}
}

class MyThread2 extends Thread{
	public void run(){
		try{
		Thread.sleep(1500);
		System.out.println("run2当前壮态: " + this.getState() + "run1 的信号为:" + getState());
		}catch(Exception e){};
	}
}


