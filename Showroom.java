import java.util.Scanner;

public class Showroom implements M.Utility {
    String[] showroom_names = new String[5];
    String[] manager_names = new String[5];
    String[] addresses = new String[5];
    int[] n_employees = new int[5];
    int[] cars_available = new int[5];
    int currentIndex = 0;
    Scanner scanner = new Scanner(System.in);

    public void get_detail() {
        for (int i = 0; i < currentIndex; i++) {
            System.out.println("\nShowroom name: " + showroom_names[i]);
            System.out.println("Manager name: " + manager_names[i]);
            System.out.println("Address: " + addresses[i]);
            System.out.println("No of Employees: " + n_employees[i]);
            System.out.println("No of cars available: " + cars_available[i]);
            System.out.println("\n");
        }
    }

public void set_detail() {
    System.out.println("\nPlease Enter the required details----->\n");
    if (currentIndex < 5) {
        System.out.println("\nEnter Your Showroom name: ");
        showroom_names[currentIndex] = scanner.nextLine();

        System.out.println("\nEnter Manager name: ");
        manager_names[currentIndex] = scanner.nextLine();

        System.out.println("\nEnter Address: ");
        addresses[currentIndex] = scanner.nextLine();

        System.out.println("\nNo of Employees: ");
        n_employees[currentIndex] = scanner.nextInt();
        scanner.nextLine(); // Consume the newline character

        System.out.println("\nNo of cars available: ");
        cars_available[currentIndex] = scanner.nextInt();
        scanner.nextLine(); // Consume the newline character

        currentIndex++;
        System.out.println("\nYour Showroom Added Successfully---->\n");
    } else {
        System.out.println("\nYou have reached the maximum number of showrooms.\n");
    }
}

    }

