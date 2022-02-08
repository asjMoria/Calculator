import java.util.Scanner;

public class Calculator 
{
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Please enter two whole numbers (ints).");
		System.out.println("1:");
		int opand1 = scanner.nextInt();
		System.out.println("2:");
		int opand2 = scanner.nextInt();
		int result = opand1 + opand2;
		
		System.out.println("Your answer is: " + result + "!");
	}
}
