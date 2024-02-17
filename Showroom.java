import java.util.Scanner;
public class Showroom implements M.Utility {
    String[] Showroom_name = new String[5];
    String[] Manager_name = new String[5];
    String[] Address = new String[5];
    int[] n_employee = new int[5];
    int[] car_available = new int[5];
    int index = -1; // Index to keep track of the current slot in the array

    public void get_detail() {
        if (index >= 0 && index < 5) {
            System.out.println("\nShowroom name: " + Showroom_name[index]);
            System.out.println("Manager name: " + Manager_name[index]);
            System.out.println("Address: " + Address[index]);
            System.out.println("No of Employees: " + n_employee[index]);
            System.out.println("No of cars available: " + car_available[index]);
            System.out.println("\n");
        } else {
            System.out.println("No data available for this index.");
        }
    }

    public void set_detail() {
        index++;
        if (index < 5) {
            Scanner Sc = new Scanner(System.in);

            System.out.println("\nEnter Your Showroom name: ");
            Showroom_name[index] = Sc.nextLine();

            System.out.println("\nEnter Manager name: ");
            Manager_name[index] = Sc.nextLine();

            System.out.println("\nEnter Address: ");
            Address[index] = Sc.nextLine();

            System.out.println("\nNo of Employees: ");
            n_employee[index] = Sc.nextInt();
            System.out.println("\nNo of cars available: ");
            car_available[index] = Sc.nextInt();
            System.out.println("\nYour Showroom Added Successfully---->\n");
        } else {
            System.out.println("Maximum number of showrooms reached.");
            index--; // Decrement index as no new data was added
        }
    }
}