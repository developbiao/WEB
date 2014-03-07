package learn.demo3;

public class Compted {   //关于一个除数的Excption  的测试
	
	public int Method(int x, int y) throws MyException{
		if (x == 0){
			throw new MyException("除数不能为0!");
		}
		else if(y == 0){
			throw new MyException("被除数不能为0!");
		}
		
		else {
			return x / y;
		}
	}

}
