/**
 * @Discribe：GenricDemo 练习题02
 * @Date:2014-01-11
 * @Author:Gongibao
 */
import java.util.ArrayList;
import java.util.Iterator;
class GenricAdvDemo_02{

	public static void main(String[] args){

		ArrayList lst_p = new ArrayList();
		lst_p.add(new Teacher("lihua",1));
		lst_p.add(new Teacher("YangWang",2));
		lst_p.add(new Teacher("WangCao",3));

		printf(lst_p);
		
		System.out.println("is ok !");
	}

	//Iterator通用的
	
	public static void printf(ArrayList<?> list){
		Iterator<?> it = list.iterator();
		while(it.hasNext()){
			System.out.println(it.next());
		}
	}
}

class Teacher{

	private String name;
	private int id;
	
	public Teacher(){
		super();
	}

	public Teacher(String name, int id){
		this.name = name;
		this.id = id;
	}


	//Attribut
	
	public void setName(String name){
		this.name = name;
	}

	public String getName(){
		return this.name;
	}

	public void setId(int id){
		this.id = id;
	}

	public int getId(){
		return id;
	}

	@Override
	
	public String toString(){
		return "Name: " + this.name + " Age:" + this.age;
	}


}
