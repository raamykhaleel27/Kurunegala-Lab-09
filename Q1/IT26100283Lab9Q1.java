import java.util.Scanner;
public class IT26100283Lab9Q1{
	public static void main(String[] args){
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter value a: ");
		int a = input.nextInt();
		
		System.out.print("Enter value b: ");
		int b = input.nextInt();
		
		System.out.print("Enter value c: ");
		int c = input.nextInt();
		
		System.out.println("");
		
		double  bsquared = Math.pow(b,2);
		double fourac = 4*a*c;
		double sqrtsymb = Math.sqrt(bsquared - fourac);
		
		double root1 = (-b + sqrtsymb)/(2*a);
		double root2 = (-b - sqrtsymb)/(2*a);
		
		System.out.println("Roots are real and different :");
		
		System.out.println("Root 1: " +root1);
		System.out.println("Root 2: " +root2);
	}
}