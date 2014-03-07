package com.oceangray;

import java.awt.Rectangle;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Iterator;

import javax.imageio.ImageIO;
import javax.imageio.ImageReadParam;
import javax.imageio.ImageReader;
import javax.imageio.stream.ImageInputStream;

import sun.management.counter.Variability;

public class ImageTest {

/**
* @param args
*/
public static void main(String[] args) {
readImageFile("C:/test.jpg","jpg");
cutImage(100, 100, 250, 200, "C:/test.jpg", "jpg", "C:/target.jpg");
}
/**
* 截取图片：
* <p>把原图片截取成选中尺寸大小和坐标的图片
* @param left 选择图片的左坐标
* @param top  选择图片的顶部坐标
* @param width 选择图片的宽度
* @param height选择图片的高度
* @param path 目标图片路径
* @param formatName 目标图片的格式
* @param newPath 截取后图片存储的路径包括文件名及格式
*/
public static void cutImage(Integer left,Integer top,Integer width,Integer height,String path,String formatName,String newPath){
try {
FileInputStream fis=new FileInputStream(path);
Iterator<ImageReader>iterator=ImageIO.getImageReadersByFormatName(formatName);
ImageReader imageReader=iterator.next();
ImageInputStream iis=ImageIO.createImageInputStream(fis);
imageReader.setInput(iis, true);
ImageReadParam param=imageReader.getDefaultReadParam();
param.setSourceRegion(new Rectangle(left, top, width,height));
BufferedImage bi=imageReader.read(0, param);
Boolean result=ImageIO.write(bi, formatName, new File(newPath));
System.out.println(result==true?"截取图片成功!":"截取图片失败!");
} catch (FileNotFoundException e) {
e.printStackTrace();
} catch (IOException e) {
e.printStackTrace();
}
}
/**
* 读取图片文件：
* <p>获取图片信息属性：
* <p>   如：图片宽度、高度、坐标等。
* @param path 图片文件的路径
* @param formatName 图片文件的格式
*/
public static void readImageFile(String path,String formatName){
try {
//①.获取文件输入流
FileInputStream fis=new FileInputStream(path);
//②.根据图片的格式，格式化图片
Iterator<ImageReader> it=ImageIO.getImageReadersByFormatName(formatName);
//③.获取ImageReader对象
ImageReader imageReader=it.next();
//④.获取Image输入流
ImageInputStream iis=ImageIO.createImageInputStream(fis);
//⑤.把Image输入流写入ImageReader对象里
imageReader.setInput(iis, true);
//⑥.获取ImageReader的参数（默认就是new一个ImageReadParam对象）
ImageReadParam param=imageReader.getDefaultReadParam();
//⑦.把图像内容读入到BufferedImage里面
BufferedImage bi=imageReader.read(0, param);
System.out.println("原始图片宽度： "+bi.getWidth()+"   原始图片高度： "+bi.getHeight());
} catch (FileNotFoundException e) {
e.printStackTrace();
} catch (IOException e) {
e.printStackTrace();
}
}

}

