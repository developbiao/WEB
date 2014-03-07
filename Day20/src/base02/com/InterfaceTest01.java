package base02.com;

public class InterfaceTest01 {
	
   public static void main(String[] args){
	   IronMan_01 ironman_01 = new IronMan_01();
	   ironman_01.runing();
	   
	   int stand;
	   stand = ironman_01.stand();
	   
	   
	   
	   System.out.println("Ok runing!" + stand);
   }

}

interface IronMan{
	abstract void runing();
	abstract int stand();
	 void Flod();
	
}

class IronMan_01{
	public void runing(){
		System.out.println("runing loading....");
	}
	
	public int stand(){
		
		return 1;
		
	}
	
//	public void Flod(){
//		System.out.println("IronMan is FLOD!");
//	}
	
}
