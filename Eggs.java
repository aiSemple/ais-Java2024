//Aaron Semple 1/25 Program Eggs
package ch2a;
import java.util.Scanner; 
public class Eggs {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int eggs;
		int dozen;
		double total;
		int loose;
		double dozenCost;
		double looseCost;
		System.out.println("Enter the number of eggs.");
		eggs = input.nextInt();
		dozen = eggs/12;
		loose = eggs%12;
		dozenCost = dozen * 3.25;
		looseCost = loose * .45;
		total = dozenCost + looseCost;
		System.out.println("You ordered " + eggs + " eggs. That's " + dozen + " dozens at $3.25 per dozen and " + loose + " loose eggs at 45 cents each for a total of $" + total + ".");
	}
}
