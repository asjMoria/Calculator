import java.util.Scanner;

public class Calculator 
{
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Please enter two numbers.");
		System.out.println("1:");
		double opand1 = scanner.nextDouble();
		System.out.println("2:");
		double opand2 = scanner.nextDouble();
		System.out.println("Would you like to add (+), subtract (-), multiply (*) or divide (/) these two numbers? (please enter either the corresponding symbol)");
		
		Scanner scan = new Scanner(System.in);
		//This is completely intentional, code will not work if I use the same Scanner
		String opor = scan.nextLine();
		
		double result = 0;
		boolean divByZero = false;
		
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
			if (opand2 == 0)
			{
				divByZero = true;
			}
			else
			{
				result = opand1 / opand2;
			}
		}
		
		if (divByZero)
		{
			System.out.println("Error: Divide by Zero");
		}
		else
		{
			System.out.println("Your answer is: " + result + "!");
		}
	}
}
