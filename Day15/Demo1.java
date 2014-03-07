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
* ��ȡͼƬ��
* <p>��ԭͼƬ��ȡ��ѡ�гߴ��С�������ͼƬ
* @param left ѡ��ͼƬ��������
* @param top  ѡ��ͼƬ�Ķ�������
* @param width ѡ��ͼƬ�Ŀ��
* @param heightѡ��ͼƬ�ĸ߶�
* @param path Ŀ��ͼƬ·��
* @param formatName Ŀ��ͼƬ�ĸ�ʽ
* @param newPath ��ȡ��ͼƬ�洢��·�������ļ�������ʽ
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
System.out.println(result==true?"��ȡͼƬ�ɹ�!":"��ȡͼƬʧ��!");
} catch (FileNotFoundException e) {
e.printStackTrace();
} catch (IOException e) {
e.printStackTrace();
}
}
/**
* ��ȡͼƬ�ļ���
* <p>��ȡͼƬ��Ϣ���ԣ�
* <p>   �磺ͼƬ��ȡ��߶ȡ�����ȡ�
* @param path ͼƬ�ļ���·��
* @param formatName ͼƬ�ļ��ĸ�ʽ
*/
public static void readImageFile(String path,String formatName){
try {
//��.��ȡ�ļ�������
FileInputStream fis=new FileInputStream(path);
//��.����ͼƬ�ĸ�ʽ����ʽ��ͼƬ
Iterator<ImageReader> it=ImageIO.getImageReadersByFormatName(formatName);
//��.��ȡImageReader����
ImageReader imageReader=it.next();
//��.��ȡImage������
ImageInputStream iis=ImageIO.createImageInputStream(fis);
//��.��Image������д��ImageReader������
imageReader.setInput(iis, true);
//��.��ȡImageReader�Ĳ�����Ĭ�Ͼ���newһ��ImageReadParam����
ImageReadParam param=imageReader.getDefaultReadParam();
//��.��ͼ�����ݶ��뵽BufferedImage����
BufferedImage bi=imageReader.read(0, param);
System.out.println("ԭʼͼƬ��ȣ� "+bi.getWidth()+"   ԭʼͼƬ�߶ȣ� "+bi.getHeight());
} catch (FileNotFoundException e) {
e.printStackTrace();
} catch (IOException e) {
e.printStackTrace();
}
}

}

