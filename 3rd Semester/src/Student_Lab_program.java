import java.util.Scanner;

class Details {
    String usn;
    String name, branch;
    long phone_number;
    float marks;
    public void initialize(String u, String n, String b, long ph, float m) {
        usn = u;
        name = n;
        branch = b;
        phone_number = ph;
        marks = m;
    }
    public void display() {
    	 System.out.println("\n-------------Student Details-------------\n");
         System.out.println("Student name\tStudent Branch\tStudent USN\tStudent Phone-Number\tStudent Total Marks");
        System.out.println(name + "\t\t" + branch + "\t\t" + usn + "\t\t" + phone_number + "\t\t" + marks);
    }
}

public class Student_Lab_program {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of Students:");
        int n = sc.nextInt();
        sc.nextLine();
        for (int i = 0; i < n; i++) {
            Details student = new Details();
            System.out.println("\nEnter details for student " + (i + 1) + ":");
            System.out.println("Enter the student name:");
            String name = sc.nextLine();
            System.out.println("Enter the student Branch:");
            String branch = sc.nextLine();
            System.out.println("Enter the student USN:");
            String usn = sc.nextLine();
            System.out.println("Enter the student Phone Number:");
            long phone_number = sc.nextLong();
            System.out.println("Enter the student Total Marks:");
            float marks = sc.nextFloat();
            sc.nextLine();
           student.initialize(usn, name, branch, phone_number, marks);
           student.display();
        }
        sc.close();
    }
}
