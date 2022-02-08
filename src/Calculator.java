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
		System.out.println("Would you like to add (+), subtract (-), multiply (*) or divide (/) these two numbers? (please enter either the corresponding symbol)");
		
		Scanner scan = new Scanner(System.in);
		//This is completely intentional, code will not work if I use the same Scanner
		String opor = scan.nextLine();
		
		int result = 0;
		
		if (opor.equals("+"))
		{
			result = opand1 + opand2;
		}
		else if (opor.equals("-"))
		{
			result = opand1 - opand2;
		}
		else if(opor.equals("*"))
		{
			result = opand1 * opand2;
		}
		else
		{
			result = opand1 / opand2;
		}
		
		System.out.println("Your answer is: " + result + "!");

	}
}
