package st1;
import java.util.Scanner;

public class Triangle {
	
	public static boolean isTriangle(double a, double b, double c) {
		if (a + b > c && a + c > b && b + c > a)
			return true;
		else
			return false;
	}
	
	public static void triangleType (double a, double b, double c){
		if (a == b || a == c || b == c ){
			if (a==b && b==c){
				System.out.print("This is an equilateral triangle");
			} else {
				System.out.print("This is an isosceles triangle");
			}
			return;
		}
		System.out.print("This is an scalene triangle");
	}
	
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		System.out.println("Please input first side:");
		double a = scan.nextDouble();
		System.out.println("Please input second side:");
		double b = scan.nextDouble();
		System.out.println("Please input third side:");
		double c = scan.nextDouble();
		scan.close();
		boolean temp = isTriangle(a,b,c);
		if (temp == true)
			triangleType(a,b,c);
		else
			System.out.print("This is not a triangle");
	}
	
}
