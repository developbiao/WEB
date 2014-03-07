/**
 * @Discribe:StringBuffer的练习题2
 * @Date:2014-01-08
 * @Author:GongBiao
 */

class StringTest_06{

	public static void main(String[] args){

		//int[] arr = new int[10];
		//
		int[] arr = {10,20,40,59,2,23};

		String str = toString2(arr);

		System.out.println(str);


	
		System.out.println("is ok !");
	}

	/**
	 * 将一个int类型的数组变成字符串格式[1，2，4] 使用String来完成
	 * @param Str
	 * @return Str
	 */

	//"," 问题解决BUG没有解决

	public static String toString1(int[] arr){

		String str ="[";

		for(int i=0; i<arr.length; i++){



		       if(i!= arr.length-1){
				str+=arr[i] + ",";
			}


			else{
			
				str+="]";
			}
			

		
		}
		

		return str;	
	
	}


/**
 * @Discribe:StringBuffer 
 * @prama str
 * @Author:Gongbiao
 */
public static String toString2(int[] arr){

	StringBuffer sb = new StringBuffer("[");

	for(int i=0; i<arr.length; i++){
	
		if(i != arr.length-1){
			sb.append(arr[i]+"|");
		}
		else{
			sb.append("]");
		}
	}

	return sb.toString();
}




}



