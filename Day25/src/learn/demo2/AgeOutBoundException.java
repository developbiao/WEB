package learn.demo2;

public class AgeOutBoundException  extends Exception{
//自定义异常
	public AgeOutBoundException(){
		System.out.println("Sorry,age out of bound !");
	}
}
