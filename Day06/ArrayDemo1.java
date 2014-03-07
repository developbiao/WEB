/*Java中的二维数组*/
class ArrayDemo1
{
	public static void main(String[] args)
	{
		int[] arry1 = new int[3]; //定义一维数组
		int[][]arry2= new int[3][]; //定义二维数组
		arry2[0] = new int[3];   //分别对二维数组的一维数组进行初始化
		arry2[1] = new int[7];
		arry2[2] = new int[2];	
		System.out.println(arry2[1]);


	}
}
