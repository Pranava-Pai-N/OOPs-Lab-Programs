package dc;

import java.util.Scanner;

public class DistanceC {
	double km,m,miles;
	Scanner sc = new Scanner(System.in);
	public void mtokm()
	{
		System.out.println("Enter the Distance in metre : ");
		m = sc.nextDouble();
		km= m/1000;
		System.out.println(m+" metres "+"is equal to "+ km +" km");
		System.out.println("\n");
	}
	public void kmtom()
	{
		System.out.println("Enter the Distance in Kilometre : ");
		km = sc.nextDouble();
		m= km * 1000;
		System.out.println(km+" Kilometre"+" is equal to "+ m +" m");
		System.out.println("\n");
	}
	
	public void milestokm()
	{
		System.out.println("Enter the Distance in miles : ");
		miles = sc.nextDouble();
		km= miles*1.60934;
		System.out.println(miles+" miles"+" is equal to "+ km +" km");
		System.out.println("\n");
	}
	
	public void kmtomiles()
	{
		System.out.println("Enter the Distance in kilometres : ");
		km = sc.nextDouble();
		miles= km*0.621371;
		System.out.println(km+" Kilometre"+" is equal to "+ miles +" miles");
		System.out.println("\n");
	}
	
}

