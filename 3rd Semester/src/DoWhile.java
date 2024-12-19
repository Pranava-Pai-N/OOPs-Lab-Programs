//Sum of n natural Numbers

import java.util.Scanner;
public class DoWhile {
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter the number of terms : ");
		int n = sc.nextInt();
		int sum =0,i=1;
		do
		{
			sum += i;
			i++;
		}
		while(i<=n);
		System.out.println("The sum of "+ n +" Natural Numbers is : "+sum);
		sc.close();
	}
}
