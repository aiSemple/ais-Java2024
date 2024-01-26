//Aaron Semple 1/25 Program inches
package ch2ca;
import java.util.Scanner;
public class ch2ca2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int inches;
		int feet;
		int rem;
		System.out.println("Enter the number of inches ");
		inches = input.nextInt();
		feet = inches/12;
		rem = inches%12;
		System.out.println(inches + " inches is " + feet + " feet and " + rem + " inches.");
	}

}
