import java.util.Scanner;

public class Employee extends Cars {
    String[] emp_id = new String[5];
    String[] emp_name = new String[5];
    String[] emp_department = new String[5];
    int[] emp_age = new int[5];
    int currentIndex = 0;

    public void get_detail() {
        for (int i = 0; i < currentIndex; i++) {
            System.out.println("\nEmployee Id: " + emp_id[i]);
            System.out.println("Employee Name: " + emp_name[i]);
            System.out.println("Employee Age: " + emp_age[i]);
            System.out.println("Employee department: " + emp_department[i]);
            System.out.println("");
        }
    }

    public void set_detail() {
        if (currentIndex < 5) {
            Scanner exp = new Scanner(System.in);

            System.out.println("\nPlease Enter the required details----->\n");

            System.out.println("\nEnter employee ID (Letters): ");
            emp_id[currentIndex] = exp.nextLine();

            System.out.println("\nEnter employee department: ");
            emp_department[currentIndex] = exp.nextLine();

            System.out.println("\nEnter employee name: ");
            emp_name[currentIndex] = exp.nextLine();

            System.out.println("\nEnter employee age: ");
            emp_age[currentIndex] = exp.nextInt();
            exp.nextLine(); // Consume the newline character

            System.out.println("\nYou have successfully added new Employee----->\n");
            currentIndex++;
        } else {
            System.out.println("You have reached your limit for adding employees.");
        }
    }
}
