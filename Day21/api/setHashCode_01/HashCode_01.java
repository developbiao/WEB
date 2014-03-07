package api.setHashCode_01;
import java.util.HashSet;

public class HashCode_01 {
	 
	public static void main(String[] args){
		HashSet<Person> hash = new HashSet<Person>();
		hash.add(new Person("Tom",18));
		hash.add(new Person("Roses",16));
		hash.add(new Person("Roses",17));
		hash.add(new Person("Biaoge",17));
		hash.add(new Person("Joke",19));
		hash.add(new Person("Like",15));
	
		
		System.out.println(hash);
		
		
		System.out.println("is ok !");
	}
}
