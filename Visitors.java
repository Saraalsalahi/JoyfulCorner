package joyfullcorner;

import java.util.ArrayList;
import java.util.Scanner;



public class Visitors extends Person {
    static Scanner in = new Scanner(System.in);
    static String fName;
    static String lName;
    static int age;
    static boolean gender;
    
    
    

    

    public Visitors(ArrayList<Person> uname1, String fName, String lName, int age, boolean gender, String uName, String Email) {
        super(uName, Email, phoneNumber, uType);
        Visitors.fName = fName;
        Visitors.lName = lName;
        Visitors.age = age;
        Visitors.gender = gender;
    }
    
    
    public static void newUser(ArrayList<Person> visitors){
        boolean check;
        do{
        System.out.println("Enter user name: ");
        uName = in.next();
        check = uNameCheck(visitors);
        uname.add(new Person(uName));
        }while (check == false);
        
        System.out.println("Enter your first name: ");
        fName = in.next();
        System.out.println("Enter your last name: ");
        lName = in.next();
        System.out.println("Enter your age: ");
        age = in.nextInt();
        System.out.println("Enter your gender: ");//check varible type//
        gender = in.hasNextBoolean();   
        System.out.println("Enter your Email: ");
        Email = in.nextLine();
        System.out.println("Enter your phone number: ");
        phoneNumber = in.next();
        visitors.add(new Visitors (uname, fName,lName,age,gender,Email,phoneNumber));
        int option = 0;
        Events.showEvent();
                 System.out.println("What would you like to do next? ");
                 System.out.println("1. display your profile");
                 System.out.println("2. give feedback");
                 System.out.println("3. make reservation");
                 System.out.println("4. show reservations");
                 option = in.nextInt();
                 switch (option){
                     case 1:
                         Visitors.displayProfile(Person.visitor);
                         break;
                     case 2:
                         Feedback.addData();
                         break;
                     case 3:
                         Reservation.newRes(Events.event);
                         break;
                     case 4:
                         Reservation.showRes();
                         break;
                     default: 
                         System.out.println("invalid input");
                 }
    }
    
    public static boolean uNameCheck(ArrayList<Person> visitor){
        boolean flag =true;
        for (int i=0;i<visitor.size();i++){
        if(uname.get(i) == visitor.get(i)){
            System.out.println("This user name belong to unother user, chose different user name");
            newUser(visitor);
            flag = false;
            return flag;
        }
        else 
            flag = true;
        
    }
        return flag;
    }
   public static void displayProfile(ArrayList<Person> visitor){
       System.out.println("Enter your user name: ");
       uName = in.next();
       for (int i=0;i<uname.size();i++){
         if (uname.get(i)== visitor.get(i)){
             System.out.println("Your user name: " + visitor.get(0));
             System.out.println("Your first name: " + visitor.get(1));
             System.out.println("Your last name: " + visitor.get(2));
             System.out.println("Your age: " + visitor.get(3));
             System.out.println("Your gender: " + visitor.get(4));
             System.out.println("Your email: " + visitor.get(5));
             System.out.println("Your phone number: " + visitor.get(6));
         }  
       
       else 
       System.out.println("this user name doesn't exist");
       
       } 
       } 
   
}
