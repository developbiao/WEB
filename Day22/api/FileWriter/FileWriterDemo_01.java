package api.FileWriter;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriterDemo_01 {

	public static void main(String[] args) throws IOException{
		
		FileWriter fw = new FileWriter("D:\\TEMP\\demo.txt");
		FileWriter f2 = new FileWriter("D:\\TEMP\\demo2.txt");
		//Êä³öÁ÷
		
		fw.write("hello moto!\n");
		fw.write("loading");
		fw.flush();
		fw.close();
		
		f2.write("this is a dog!");
		f2.write("Write is ok !");
		f2.flush();
		f2.close();
		
		System.out.println("is ok!");
	}
}
