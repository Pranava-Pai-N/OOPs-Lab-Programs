package tc;

import java.util.Scanner;

public class TimeC {
	double hours,minutes,seconds;
	Scanner sc = new Scanner(System.in);
	public void hourstominutes()
	{
		System.out.println("Enter the time in Hours : ");
		hours = sc.nextDouble();
		minutes= hours * 60;
		System.out.println(hours+" hours"+" is equal to "+ minutes +" minutes");
		System.out.println("\n");
	}
	public void minutestohours()
	{
		System.out.println("Enter the time in Minutes: ");
		minutes = sc.nextDouble();
		hours= minutes / 60;
		System.out.println(minutes+" minutes"+" is equal to "+ hours +" hours");
		System.out.println("\n");
	}
	public void hourstoseconds()
	{
		System.out.println("Enter the time in Hours : ");
		hours = sc.nextDouble();
		seconds= hours * 3600;
		System.out.println(hours+" hours"+" is equal to "+ seconds +" seconds");
		System.out.println("\n");
	}
	public void secondstohours()
	{
		System.out.println("Enter the time in Seconds : ");
		seconds = sc.nextDouble();
		hours= seconds / 3600;
		System.out.println(seconds+" seconds"+" is equal to "+ hours +" hours");
		System.out.println("\n");
	}}

