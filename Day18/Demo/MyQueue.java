import java.util.LinkedList;

class MyQueue{

	private LinkedList link = null;

	public MyQueue(){
	
		link = new LinkedList<String>();
	}

	public void myAdd(String lst){
	
		link.add(lst);
	}

	public Object myGet(){
	
		return link.removeFirst();
	}

	public boolean isNull(){
	
		return link.isEmpty();
	}
}
