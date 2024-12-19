import java.util.Scanner;
class Studinfo {
    String USN;
    String name;
    String branch;
    long phone_no;
    Studinfo(String u, String n, String b, long ph) {
        USN = u;
        name = n;
        branch = b;
        phone_no = ph;
    }
    void getdetails() {
        System.out.println("Student USN      = " + USN);
        System.out.println("Student Name     = " + name);
        System.out.println("Student Branch   = " + branch);
        System.out.println("Student Phone No = " + phone_no);
        System.out.println();
    }
}

public class Students {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of students:");
        int n = sc.nextInt();
        sc.nextLine();
        Studinfo[] st = new Studinfo[n];
        for (int i = 0; i < n; i++) {
            System.out.println("\nEnter details for Student " + (i + 1));
            System.out.print("Enter Student USN: ");
            String USN = sc.nextLine();
            System.out.print("Enter Student Name: ");
            String name = sc.nextLine();
            System.out.print("Enter Student Branch: ");
            String branch = sc.nextLine();
            System.out.print("Enter Student Phone Number: ");
            long phone_no = sc.nextLong();
            sc.nextLine();
            st[i] = new Studinfo(USN, name, branch, phone_no);
        }
        System.out.println("-----------Student Details-----------------");
        for (int i = 0; i < n; i++)
        {
        	st[i].getdetails();
        }
        System.out.println("------------------------------------------");
        sc.close();
    }
}
