package api.genner;

public class GenericDemo3 {
	public static void main(String[] args){
		Tool2<String> t= new Tool2<String>();
		t.show("abc");
		t.myprint("nba");
		
//		Tool2<Integer> t1 = new Tool2<Integer>();
//		t1.myprint(new Integer(4));
		
		Tool2<String> t1 = new Tool2<String>();
		t1.myprint(new Integer(7));
		
	}
}

class Tool2<W>{
	
	public void show(W w){
		System.out.println("show:"+w.toString());
	}
	
	public <A> void myprint(A a){
		System.out.println("Myprint:"+a.toString());
		
	}
	
	public static <X> void myshow2(X x){  //��̬��������ʹ�÷Ǿ�̬������,��ʱҪ��ֻ�ܰѷ��Ͷ����ڷ�����
		System.out.println(x);
	}
	
}
