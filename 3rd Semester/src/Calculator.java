import maths.*;
import java.util.Scanner;
public class Calculator {

	public static void main(String[] args) {
	Scanner in = new Scanner(System.in);
	System.out.println("\nWelcome to Pranav's Calculator\n");
	while(true)
	{
	System.out.println("\n1.Addition\n2.Subtraction\n3.Multiplication\n4.Division\n5.Exit\n");
	System.out.println("Enter your Choice : ");
	int choice = in.nextInt();
	Operations obj = new Operations();
	switch(choice)
	{
	case 1:obj.addition();
		   break;
	case 2:obj.subtraction();
		   break;
	case 3:obj.multiplication();
		   break;
	case 4 : obj.Division();
			break;
	case 5 : return;
	default:System.out.println("Enter a Valid Number");
	}
		
	}
	}
}
