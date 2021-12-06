package joyfullcorner;

import java.util.ArrayList;
import java.util.Scanner;

public class Reservation {
    static Scanner in =new Scanner(System.in);
    static int numOfTicket;
    static int ticketPrice;
    static double price;
    static int numOfRes;
    static String date;
    static String evCode;
    static int tOfRes;
    static ArrayList<Reservation>res=new ArrayList<Reservation>();

    public Reservation(int numOfTicket, int ticketPrice, double price, int numOfRes, String evCode ) {
        Reservation.numOfTicket=numOfTicket;
        Reservation.ticketPrice=ticketPrice;
        Reservation.price =price;
        Reservation.numOfRes = numOfRes;
        Reservation.evCode = evCode ;
    }
    

    
    public static void newRes(ArrayList<Events> event){
        boolean flag = false;
        do {
        System.out.println("Enter the code of the event: ");
        evCode = in.next();
        String temp = Events.getEventCode();
        for (int i=0;i<event.size();i++)
        if (event.get(i).equals(temp)){
           ticketPrice = Events.gettPrice();
           flag = true;
       }
        else {
           System.out.println("code wasn't found!");
       }} while(flag == false);
        
       System.out.println("Enter the number of tickets: ");
       numOfTicket = in.nextInt();
       System.out.println("Enter the date: (dd/mm/yyyy)");
       date = in.nextLine();
       System.out.println("The total price of your reservation is " + price());
       numOfRes++;
       res.add(new Reservation (numOfTicket, ticketPrice, price, numOfRes, evCode));
       System.out.println("Your reservation number is: " + numOfRes);
    }
    public static void showRes(){
        for (int i=0;i<res.size();i++){
            System.out.println("Reservations: ");
            System.out.println(res.get(i));
        }
    }
    
    public static double price(){
        price = ticketPrice*numOfTicket;
        return price;
        
    }
    public static void cancleRes(){
        System.out.println("Enter the number of reservation you want to delete: ");
        numOfRes =in.nextInt();
        for (int i=0;i<res.size();i++){
            if (res.get(i).equals(numOfRes)){
                res.remove(i);
                System.out.println("Reservation deleted succefully!");
            }
            else
                System.out.println("invalid input");
        }
    }  
}
