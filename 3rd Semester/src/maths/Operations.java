package maths;
import java.util.Scanner;
public class Operations {
	double a,b;
	public void addition()
	{
		Scanner in = new Scanner(System.in);
		System.out.println("Enter First Number : ");
		a = in.nextDouble();
		System.out.println("Enter Second Number : ");
		b = in.nextDouble();
		double z = a+b;
		System.out.println("Sum is : "+z);
	}
	public void subtraction()
	{
		Scanner in = new Scanner(System.in);
		System.out.println("Enter First Number : ");
		a = in.nextDouble();
		System.out.println("Enter Second Number : ");
		b = in.nextDouble();
		double z = a-b;
		System.out.println("Difference is : "+z);
	}
	public void multiplication()
	{
		Scanner in = new Scanner(System.in);
		System.out.println("Enter First Number : ");
		a = in.nextDouble();
		System.out.println("Enter Second Number : ");
		b = in.nextDouble();
		double z = a*b;
		System.out.println("Product is : "+z);
	}
	public void Division()
	{
		Scanner in = new Scanner(System.in);
		System.out.println("Enter First Number : ");
		a = in.nextDouble();
		System.out.println("Enter Second Number : ");
		b = in.nextDouble();
		if(b==0)
		{
			System.out.println("Divide by Zero Error\n");
		}
		else
		{
			double z = a/b;
			System.out.println("Quotient is : "+z);
		}

	}
}
