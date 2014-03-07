/**
 * @Discribe:Java中文件的操作熟悉
 * @Date:2014-01-13
 * @Author:Gongbiao
 *
 */
import java.io.IOException;
import java.io.FileWriter;
import java.io.FileReader;

class FileDemo_01{

	public static void main(String[] args){
		try{

		FileWriter fw = new FileWriter("myfile.txt");
		fw.write("Hello fileWriter !");
		fw.write("Myname is GongBiao");
		fw.write("Writer is ok!");
		fw.close();
	

		}catch(IOException e){
			e.printStackTrace();
		}

		try{

			//文件的读作操

			FileReader fr = new FileReader("FileDemo_01.java");
			//int c = fr.read();
			//int x = fr.read();
			//fr.close();

			//不转换成整型可以损失精度
			//System.out.println((char)c);
			//System.out.println((char)x);
			
			int c;

			while((c= fr.read()) != -1){
			
				System.out.print((char)c);
			}


		}catch(IOException e){
			e.printStackTrace();
		}
		
	
		System.out.println("is ok !");
	}
}
