package joyfullcorner;

import java.util.ArrayList;
import java.util.Scanner;

public class Person {
    static String uName; //User name//
    static String Email; 
    static String phoneNumber;
    static String uType; //user type visitor or owner//
    static ArrayList<Person> uname = new ArrayList();
    static Scanner in = new Scanner(System.in);
    static ArrayList<EventOwner> owners = new ArrayList();
    static ArrayList<Person> visitor = new ArrayList();

    public Person(String uName) {
    }
    
    public Person(String uName, String Email, String phoneNumber, String uType) {
        Person.uName =uName;
        Person.Email = Email;
        Person.phoneNumber = phoneNumber;
        Person.uType = uType;
    }
    public static void  uTypeCheck(){
        int choice;
        System.out.println("You will be signing up as: ");
        System.out.println("1. Event owner");
        System.out.println("2. Visitor");
        choice = in.nextInt();
        switch (choice){
            case 1: 
                EventOwner.newUser(owners);
                break;
            case 2:
                Visitors.newUser(visitor);
                break;
            default:
                System.out.println("invalid input");
        }
    }
    public static void newUser(){
        
    }   
}
