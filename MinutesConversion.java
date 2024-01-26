package ch2a;
import java.util.Scanner;
public class MinutesConversion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		float days;
		int minutes;
		double hours;
		System.out.println("Enter the number of minutes.");
		minutes = input.nextInt();
		hours = minutes/60;
		days = minutes/1440;
		System.out.println(minutes + " Equals " + hours + " hours and also eqauls " + days + " days");
		
	}

}
