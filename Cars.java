import java.util.Scanner;


public class Cars extends Showroom {
    String Carname;
    String Cartype;
    String Carcolor;
    int Carprice;
    public void get_detail() {

        System.out.println("\nCar Name :"+Carname);
        System.out.println("Car Type :"+Cartype);
        System.out.println("Car colour : "+Carcolor);
        System.out.println("Car Price: "+ Carprice);
        System.out.println("");

    }

    public void set_detail() {
    	    	    	    	            	System.out.println("\nPlease Enter the required details----->\n");

       Scanner C= new Scanner(System.in);
        System.out.println("\nCar Name :");
                Carname = C.nextLine();

        System.out.println("\nCar Type \n(Petrol/ disel/ Hybrid/ Electric)");
                Cartype = C.nextLine();

        System.out.println("\nCar colour : ");
                Carcolor = C.nextLine();

        System.out.println("\nCar Price: ");
                Carprice = C.nextInt();
                        System.out.println("\nYour Car has been successfully added----->\n");


    }
}