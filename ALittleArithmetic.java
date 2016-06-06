import java.text.DecimalFormat;
import java.util.Scanner;

public class ALittleArithmetic {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Hey! You!... Yeah! You!...Enter a radius:");
		double radius = keyboard.nextDouble();
		
		double diameter = 2*radius;
		double circumference = Math.PI*radius;
		double volume = (4.0/3.0)*Math.PI*Math.pow(radius, 3.0);
		double area = Math.PI*Math.pow(radius, 2.0);
		
		area = (double)Math.round(area*1000)/1000;
		volume = (double)Math.round(volume* 1000)/ 1000;
		diameter =(double) Math.round (diameter*1000)/1000;
		circumference = (double) Math.round (circumference*1000)/1000;
		
		System.out.println("A Circle with radius : "+radius+" will have an area of : " +area+ " squared units.");
		System.out.println("A Circle with radius : "+radius+" will have a diameter of : " +diameter);
		System.out.println("A Circle with radius : " +radius+ " will have a circumference of : " +circumference);
		System.out.println("A Circle with radius : "+radius+" will have a volume of : " +volume);
		

	}

}
