package base03.com;

public class bubbleSort {
	
	public static void main(String[] args){
		
		int arry[] = new int[10];
		for(int i=0; i<arry.length; i++){
			arry[i] = (int)(Math.random()*100);
			System.out.print(arry[i] + "\t");
		}
		
		bubbleSort(arry);
		
	    System.out.println("-------------");
		
		
		for(int i=0; i<arry.length; i++){
			System.out.print(arry[i] + "\t");
		}
		System.out.println("is ok!");
	}
	
	
	//bubbleSort
	
		public static void bubbleSort(int arr[]){
			int temp = 0;
			
			for(int i=0; i<arr.length; i++){
				for(int j=0; j<arr.length-1-i; j++){
					
					if(arr[j] > arr[j+1]){
						temp = arr[j];
						arr[j] = arr[j+1];
						arr[j+1] = temp;
					}
					
				}
			}
		}
	
	
	
}
