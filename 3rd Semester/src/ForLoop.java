//Sum of N natural Numbers

import java.util.Scanner;
public class ForLoop {

	public static void main(String[] args) {
		int sum =0;
		Scanner sc =new Scanner(System.in);
		System.out.println("enter the number of terms : ");
		int n = sc.nextInt();
		for(int i=1;i<=n;i++)
		{
			sum+=i;
		}
		System.out.println("Sum of "+ n + " natural numbers is : " +sum);
		sc.close();
	}

}
