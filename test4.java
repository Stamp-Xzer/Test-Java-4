import java.util.*;

public class test4 {
    static ArrayList<String[]> students = new ArrayList<>();

    public static void Add_Student() {
        Scanner scanner = new Scanner(System.in);
        System.out.printf("Enter Student ID: ");
        String studentID = scanner.nextLine();
        System.out.printf("Enter Student Name: ");
        String studentName = scanner.nextLine();
        System.out.printf("Enter Student Score: ");
        String studentScore = scanner.nextLine();
        System.out.println("Student added successfully.");
        String[] studentData = { studentID, studentName, studentScore };
        students.add(studentData);
        mainMenu();
    }

    public static void Show_All_Students() {
        String garde = null;
        System.out.println("All Students:");
        for (String[] student : students) {
            System.out.printf("ID: " + student[0] + ", ");
            System.out.printf("Name: " + student[1] + ", ");
            System.out.printf("Score: " + student[2] + ", ");
            if (Integer.parseInt(student[2]) >= 90) {
                garde = "A";
            } else if (Integer.parseInt(student[2]) >= 80) {
                garde = "B";
            } else if (Integer.parseInt(student[2]) >= 70) {
                garde = "C";
            } else if (Integer.parseInt(student[2]) >= 60) {
                garde = "D";
            } else {
                garde = "F";
            }
            System.out.printf("Grade: " + garde + " ");
            System.out.println();
        }

        mainMenu();
    }

    public static void main(String[] args) {
        mainMenu();
    }

    public static void mainMenu() {
        System.out.println("Student Management Program");
        System.out.println("1. Add Student");
        System.out.println("2. Display All Students");
        System.out.println("3. Save To file");
        System.out.println("4. Exit");
        System.out.printf("Enter your choice: ");

        Scanner scanner = new Scanner(System.in);
        int choice = scanner.nextInt();

        switch (choice) {
            case 1:
                Add_Student();
                break;
            case 2:
                Show_All_Students();
                break;
            case 3:
                break;
            case 4:
                System.out.println("Exiting program. Goodbye!");
                break;
            default:
                System.out.println("Invalid choice. Please enter a number between 1 and 4.");
                mainMenu();
                break;
        }
    }
}
