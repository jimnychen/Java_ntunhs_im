package helloworld;
import java.util.Scanner;
import java. lang.Math;

public class helloworld {
	static Scanner scanner = new Scanner(System.in);

	static int pv;
	static double fv;
	static final double interest=0.05;
	static int interval;
	public static void main(String[] args) {
			System.out.print("input pv:");
			pv = scanner.nextInt();
			interval=12;

			fv= pv * Math.pow((1+interest),interval);

			System.out.println("My pv is " + pv + " and after "+ interval +"year it would be " +fv);
	}
	
}
                                     