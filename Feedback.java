package joyfullcorner;
import java.util.Scanner;

public class Feedback {
    static Scanner input = new Scanner(System.in);
    static String data;
    static String name;
    static String email;
    static String type;
    static String title;

    public Feedback(String data, String name, String email, String type, String title) {
        Feedback.data = data;
        Feedback.name = name;
        Feedback.email = email;
        Feedback.type = type;
        Feedback.title = title;
    }
    
    
   
    public static void editUserInfo(){
        System.out.println("Enter your edited feedback: ");
        data = input.nextLine();
    }
    
    public static void addData(){
        System.out.println("Enter your full name: ");
        name = input.nextLine();
        System.out.println("Enter your email: ");
        email = input.next();
        System.out.println("Enter the type of feedback(complaint or suggestion): ");
        type = input.nextLine();
        System.out.println("Enter your feedback: ");
        data = input.nextLine();
    }
    public static void displayFeed(){
        System.out.println("Name " + name);
        System.out.println("Type of feedback " + type);
        System.out.println("Your feedback: " + data);
    }
}
