import java.util.Scanner;
public class M {
    
    public interface Utility {
    void get_detail();
    void set_detail();
}
    public static Scanner scanner = new Scanner(System.in);
         static Showroom showroom = new Showroom();
         static Cars cars = new Cars();
         static Employee employee = new Employee();


static void option(){
	
	System.out.println("Enter an option to continue: \n0. Exit\n1. Menu");
     int Op =scanner.nextInt();
	switch(Op){
	case 0:
break;
case 1:
	menu();
	break;
default:
	System.out.println("Enter a valid option\n ");
option();
	}
}
public static void menu() {

        System.out.println("\nWelcome to the Showroom Management System--------------->");
        System.out.println("\nEnter Your choice \n1. Showroom \n2. Cars \n3. Employees \n0. Exit :-");
        int choice = scanner.nextInt();
        switch (choice) {
            case 1:
                System.out.println("\nEnter a Choice:\n1. Add new Showroom\n2. Show existing Showroom");
                int cc=scanner.nextInt();
                if (cc == 1){
                	showroom.set_detail();
                }
                	else if(cc ==2){
                		                showroom.get_detail();

                	}
                	else {
                		System.out.println("Enter a valid choice: ");
                	}
                option();
                break; 


            case 2:
            	System.out.println("\nEnter a Choice:\n1. Add new Cars\n2. Show existing Cars");
                int cc1=scanner.nextInt();
                if (cc1 == 1){
                cars.set_detail();

                }
                	else if(cc1 ==2){
                    cars.get_detail();


                	}
                	else {
                		System.out.println("Enter a valid choice: ");
                	}
                option();
                

                break;
            case 3:
                System.out.println("\nEnter a Choice:\n1. Add new Employee\n2. Show existing Employee");
                int cc2=scanner.nextInt();  
                if (cc2==1){
                                employee.set_detail();
	
                }              
                else if (cc2==2) {
                	employee.get_detail();
                	
                }    
                else{
                	System.out.println("Enter a valid choice");
                }            
                option();

                break;
            case 0:
            	break;
            default:
                System.out.println("Invalid choice\n");
                menu();
        }

        scanner.close();
    }

    public static void main(String[] args) {
        menu();
        scanner.close();
    }
}
