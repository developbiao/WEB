/**
 * @Date:2014/03/03
 * @Discribe:Computed Area, perimeter, volume
 * @Author:GongBiao
 */
package learn.demo;
import java.util.Scanner;
public class CircleCalculate {
	private static final double PI = 3.1415926;  //default value an final
	public static void main(String[] args){
		
		double area, preimeter, volume;  
		double r;   //Radius;
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Pleas Enter Radius:");  
		r  = scanner.nextInt();
		
		area = 2 * PI * r;
		preimeter = PI * Math.pow(r, 3);
		volume = 4 / 3 * PI * Math.pow(r, 3);
		
		System.out.println("area: " + area + "\n preimeter: " + "\n volume: " + volume);
		
		
		
	}

}
