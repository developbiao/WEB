class ThreadDemo_01{
	public static void main(String[] args){
		//�߳�״̬

		MyThread2 t2 = new MyThread2();
		MyThread mt = new MyThread(t2);
		//��ǰ��δ������������new״̬
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
		System.out.println("run1��ǰ׳̬: " + this.getState() + "run2�ĵ�ǰ׳̬:" + t.getState());
	}
}

class MyThread2 extends Thread{
	public void run(){
		try{
		Thread.sleep(1500);
		System.out.println("run2��ǰ׳̬: " + this.getState() + "run1 ���ź�Ϊ:" + getState());
		}catch(Exception e){};
	}
}


