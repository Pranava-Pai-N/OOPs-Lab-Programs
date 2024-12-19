package cc;

import java.util.Scanner;
public class CurrencyC {
	double inr,usd;
	double euro,yen;
	Scanner sc = new Scanner(System.in);
	public void dollartorupee()
	{
		System.out.println("Enter Dollars to Convert to rupees : ");
		usd = sc.nextDouble();
		inr = usd * 81.83 ;
		System.out.println("Dollar = "+usd+" equal to INR = "+inr );
		System.out.println("\n");
	}
	public void rupeetodollar()
	{
		System.out.println("Enter Rupees to Convert to Dollars : ");
		inr = sc.nextDouble();
		usd = inr / 81.83 ;
		System.out.println("Rupees = "+inr+" equal to Dollars = "+usd );
		System.out.println("\n");
	}
	public void eurotorupee()
	{
		System.out.println("Enter Euros to Convert to rupees : ");
		euro = sc.nextDouble();
		inr = euro * 79.06 ;
		System.out.println("Euro = "+euro+" equal to INR = "+inr );
		System.out.println("\n");
	}
	public void rupeetoeuro()
	{
		System.out.println("Enter Rupees to Convert to Euros : ");
		inr = sc.nextDouble();
		euro = inr/79.06 ;
		System.out.println("Rupees = "+inr+" equal to Euros = "+euro);
		System.out.println("\n");
	}
	public void yentorupee()
	{
		System.out.println("Enter Yen to Convert to rupees : ");
		yen = sc.nextDouble();
		inr = yen * 0.57;
		System.out.println("Yen = "+yen+" equal to INR = "+inr );
		System.out.println("\n");
	}
	public void rupeetoyen()
	{
		System.out.println("Enter Rupee to Convert to Yen : ");
		inr = sc.nextDouble();
		yen = inr /0.57;
		System.out.println("INR = "+inr+" equal to YEN = "+yen );
		System.out.println("\n");
	}
}

