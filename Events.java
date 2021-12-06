package joyfullcorner;

import java.util.ArrayList;
import java.util.Scanner;
public class Events extends EventOwner {
    
    static String location;
    static String eventType;
    static String eventName;
    static String eventCode;
    static String date;
    static int tPrice;
    static Scanner in = new Scanner(System.in);
    static ArrayList<Events> event = new ArrayList();

    public Events(String location, String eventType, String eventName, String eventCode, String date, String oName, int tPrice) {
        super(oName, ownerType, uName, Email, phoneNumber);
        Events.location = location;
        Events.eventType = eventType;
        Events.eventName = eventName;
        Events.eventCode = eventCode;
        Events.date = date;
        Events.tPrice =tPrice;
    }

    public static int gettPrice() {
        return tPrice;
    }

    public static String getEventCode() {
        return eventCode;
    }
    
    public static void addEvent(){
        System.out.println("Enter event name: ");
        eventName = in.nextLine();
        System.out.println("Enter event type: ");
        eventType = in.nextLine();
        System.out.println("Enter event code: ");
        eventCode = in.nextLine();
        System.out.println("Enter event location: ");
        location = in.nextLine();
        System.out.println("Enter Date: ");
        date = in.next();
        System.out.println("Enter the price for one ticket: (if the reservation doesn't need payment set the price to 0) ");
        tPrice = in.nextInt();
        event.add(new Events (eventName, eventType, eventCode, location, date, oName, tPrice));
    }
    public static void showEvent(){
        System.out.println("All Events: ");
        for (int i=0;i<event.size();i++){
            System.out.println(event.get(i));
        }
    }
    
    public static void showMyEvent(){
        for (int i=0;i<event.size();i++){
            if (event.get(i).equals(oName)){
                System.out.println(event.get(i));
            }
            else {
                System.out.println("You don't have any events!");
            }
        }
    }
    
    public static void deleteEvent(){
        System.out.println("Enter event name you want to delete: ");
        eventName = in.nextLine();
        for (int i=0;i<event.size();i++){
            if (event.get(i).equals(eventName)){
                event.remove(i);
                System.out.println("Event deleted successfully!");
        }
            else {
                System.out.println("Event wasn't found");}
    }
    }
}
