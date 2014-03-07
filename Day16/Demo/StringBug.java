/**
 * @Discribe:String练习“，”的问题解决 
 * @Date:2014-01-08
 * @Author:Gongbiao
 */
class StringBug{

	public static void main(String[] args){
		int[] arr = {10,22,44,23,78,21,55};
		
		String str; 

		Demo d1 = new Demo(arr);
		str = d1.toString();
		
		System.out.println(str);
		
		System.out.println("is ok !");
	}

}

class Demo{

	int[] arr;
	
	public Demo(int[] arr){
		this.arr = arr;
	}

	public String toString(){
	
		String str = "[";
		for(int i=0; i<arr.length; i++){

			if(i != arr.length-1){
				if(i==arr.length-2){    //问题得到解决
					str+=arr[i];
				}
				else{
			
				str+=arr[i] + ",";
				}
			}

			else{
				str+="]";
			}
		}

		return str;

	}
}
