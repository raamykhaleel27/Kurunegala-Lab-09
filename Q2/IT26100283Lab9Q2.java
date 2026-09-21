import java.util.Scanner;
public class IT26100283Lab9Q2{
	public static double circleArea(double radius){
		
		double area = Math.PI*radius*radius;
		return area;
		
	}

public static void main(String[] args){
	
	Scanner input = new Scanner(System.in);
	
	System.out.print("Enter the radius of the circle: ");
	double radius = input.nextDouble();
	
	System.out.print("The area of the circle with radius "+radius + " is : " +circleArea(radius));
}
}