//import java.util.*;
class Student_Demo {
	String usn;
	String name;
	float totalmarks;
	int semester;
	
	public void set(String u,String n,float t,int s){
		usn=u;
		name=n;
		totalmarks=t;
		semester=s;
	}
	public float cgpa(){
	return (float)(totalmarks*semester/(1000*9.5));
	}
}
 public class Student
 {
	 public static void main(String args[])
	 {
		 Student_Demo s1=new Student_Demo();
		 s1.set("4SF23CS147","Pranav",1580,2);
		 double cgpa=s1.cgpa();
		 System.out.println("The Name of the Student="+s1.name);
		 System.out.println("The USN of the Student="+s1.usn);
		 System.out.println("The Total Marks of the Student="+s1.totalmarks);
		 System.out.println("The Total Marks of the Student="+s1.semester);
		 System.out.println("The cgpa of the Student="+cgpa);
	 }
 }
