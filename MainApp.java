package studentmanagement.main;

import java.util.Scanner;
import studentmanagement.model.Student;
import studentmanagement.service.StudentManager;

public class MainApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter total number of students: ");
        int n = sc.nextInt();

        StudentManager manager = new StudentManager(n);

        while (true) {
            System.out.println("1. Add Student");
            System.out.println("2. Delete Student");
            System.out.println("3. Update Marks");
            System.out.println("4. View All");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            int ch = sc.nextInt();

            switch (ch) {
                case 1:
                    System.out.print("Enter Roll No: ");
                    int roll = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Enter Name: ");
                    String name = sc.nextLine();
                    System.out.print("Enter Email: ");
                    String email = sc.nextLine();
                    System.out.print("Enter Course: ");
                    String course = sc.nextLine();
                    System.out.print("Enter Marks: ");
                    double marks = sc.nextDouble();
                    Student s = new Student(roll, name, email, course, marks);
                    manager.addStudent(s);
                    break;
                case 2:
                    System.out.print("Enter Roll No to Delete: ");
                    int r = sc.nextInt();
                    manager.deleteStudent(r);
                    break;
                case 3:
                    System.out.print("Enter Roll No to Update: ");
                    int ru = sc.nextInt();
                    System.out.print("Enter New Marks: ");
                    double m = sc.nextDouble();
                    manager.updateStudent(ru, m);
                    break;
                case 4:
                    manager.viewAll();
                    break;
                case 5:
                    System.out.println("Exiting...");
                    return;
                default:
                    System.out.println("Invalid choice.");
            }
        }
    }
}
