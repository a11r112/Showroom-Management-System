import java.util.Scanner;


public class Employee extends Cars {
	String emp_id;
	String emp_name;
	String emp_department;
    int emp_age;

    public void get_detail() {

    	System.out.println("\nEmployee Id: "+emp_id);
    	System.out.println("Employee Name: "+emp_name);
    	System.out.println("Employee Age: "+emp_age);
    	System.out.println("Employee department: "+emp_department);
    	        System.out.println("");


    }

    public void set_detail() {
    	    	    	            	System.out.println("\nPlease Enter the required details----->\n");

    	Scanner exp =new Scanner(System.in);
        System.out.println("\nEnter employee ID (Letters): ");
                emp_id=exp.nextLine();
    	System.out.println("\nEnter employee department: ");
    	        emp_department=exp.nextLine();

        
        System.out.println("\nEnter employee name: ");
                emp_name=exp.nextLine();
    	
    	System.out.println("\nEnter employee age: ");
    	        emp_age=exp.nextInt();
    	            	System.out.println("\nYou have successfully added new Employee----->\n");



    	


    }
}