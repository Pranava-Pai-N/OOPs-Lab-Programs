import java.util.Scanner;
public class WhileLoop {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n,rev=0;
		System.out.println("Enter a number to reverse : ");
		n= sc .nextInt();
		while (n>0)
		{
			int digit = n % 10;
			rev = rev * 10 + digit ;
			n/=10;	
		}
		System.out.println("Reversed Number is : "+ rev);
		sc.close();
	}
}
