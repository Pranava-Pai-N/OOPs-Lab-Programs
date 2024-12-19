import java.util.*;
public class Box
{
		public static void main(String[] args) {
			double length,width,depth;
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter the length,width and depth:\n");
			length=sc.nextDouble();
			width=sc.nextDouble();
			depth=sc.nextDouble();
			System.out.println("Volume of the box="+(length*width*depth));
			sc.close();
		}
	}

 