package joyfullcorner;

import java.util.ArrayList;
import java.util.Scanner;
import static joyfullcorner.Person.Email;
import static joyfullcorner.Person.phoneNumber;
import static joyfullcorner.Person.uName;
import static joyfullcorner.Person.uname;

public class EventOwner extends Person {
    static String oName;
    static String ownerType;
    static Scanner in = new Scanner(System.in);
    

    public EventOwner(String oName, String ownerType, String uName, String Email, String phoneNumber) {
        super(uName, Email, phoneNumber, uType);
        EventOwner.oName = oName;
        EventOwner.ownerType = ownerType;
    }
    public static void newUser(ArrayList<EventOwner> owner){
        boolean check;
        do{
        System.out.println("Enter user name: ");
        uName = in.next();
        check = uNameCheck(owner);
        uname.add(new Person(uName));
        }while (check == false);
        
        System.out.println("Enter owner's name: ");
        oName=in.next();
        System.out.println("Enter owner's type: (Restaurant, festival, etc");
        ownerType=in.next();
        System.out.println("Enter your Email: ");
        Email = in.next();
        System.out.println("Enter your phone number: ");
        phoneNumber = in.next();
        owner.add(new EventOwner (oName, ownerType,uName,Email,phoneNumber));
        int option =0;
        Events.showEvent();
                 System.out.println("What would you like to do next? ");
                 System.out.println("1. display your events");
                 System.out.println("2. delete an event");
                 System.out.println("3. add an event");
                 option =in.nextInt();
                 switch (option){
                     case 1:
                         Events.showMyEvent();
                         break;
                     case 2:
                         Events.deleteEvent();
                         break;
                     case 3:
                         Events.addEvent();
                         break;
                     default:
                         System.out.println("invalid input");
                 }
    }
    public static boolean uNameCheck(ArrayList<EventOwner> owner){
        boolean flag =true;
        for (int i=0;i<owner.size();i++){
        if(uname.get(i) == owner.get(i)){
            System.out.println("This user name belong to unother user, chose different user name");
            EventOwner.newUser(owner);
            flag = false;
            return flag;
        }
        else 
            flag = true;
        
    }
        return flag;
    }
    public void showProfile(ArrayList<EventOwner> owner){
        uName = in.next();
       for (int i=0;i<uname.size();i++){
         if (uname.get(i)== owner.get(i)){
             System.out.println("Owner's name: " + owner.get(0));
             System.out.println("Owner's type: " + owner.get(1));
             System.out.println("Your user name: " + owner.get(2));
             System.out.println("Your email: " + owner.get(3));
             System.out.println("Your phone number: " + owner.get(4));
         }  
       
       else 
       System.out.println("this user name doesn't exist");
       
       }
    }
    
    
}
