import java.util.Scanner;


public class Cars extends Showroom {
    String Carname[]=new String[5];
    String Cartype[]= new String[5];
    String Carcolor[]=new String [5];
    int Carprice[]=new int[5];
    int currentIndex=0;
           Scanner C= new Scanner(System.in);



    public void get_detail() {

        for (int i=0;i<currentIndex ;i++ ) {
        
        System.out.println("\nCar Name :"+Carname[i]);
        System.out.println("Car Type :"+Cartype[i]);
        System.out.println("Car colour : "+Carcolor[i]);
        System.out.println("Car Price: "+ Carprice[i]);
        System.out.println("");
 	
        }

        
    }

    public void set_detail() {
    	System.out.println("\nPlease Enter the required details----->\n");

        if (currentIndex<5){
        System.out.println("\nCar Name :");
                Carname[currentIndex] = C.nextLine();

        System.out.println("\nCar Type \n(Petrol/ disel/ Hybrid/ Electric)");
                Cartype[currentIndex] = C.nextLine();

        System.out.println("\nCar colour : ");
                Carcolor[currentIndex] = C.nextLine();

        System.out.println("\nCar Price: ");
                Carprice[currentIndex] = C.nextInt();
                        System.out.println("\nYour Car has been successfully added----->\n");
                        currentIndex++;
                        C.nextLine();


    }
    else{
    	System.out.println("You have reched your limit for adding Cars------->");
    }
}
}
