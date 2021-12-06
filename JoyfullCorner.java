//Sara AL-Salahi 2200001151//
//Sahar Almuhaishi 2200005060//
//Masomah Alshaer 2200004393//
package joyfullcorner;


import java.util.Scanner;


public class JoyfullCorner {

    
    public static void main(String[] args) {
        int choice; //to choose action//
        boolean flag = false;
        Scanner in = new Scanner(System.in);
        
        
        System.out.println("\t -Welcome to joyful corner!- \t");
        System.out.println("Choose a number from the follwing list:  ");
        System.out.println("1. to sign in");
        System.out.println("2. to sign up");
        System.out.println("3. to conitnue as visitor");
        
        do {
        System.out.println("Your choice: ");
        choice = in.nextInt();
        switch (choice) {
            case 1 -> {
                signIn();
                flag = true;
                }
            case 2 -> {
                Person.uTypeCheck();
                flag = true;
                }
            case 3 -> //visitor options//
                flag = true;
            default -> System.out.println("Invalid input!");
        }
        }while(flag == false);
    }

    public static void signIn (){
        Scanner in = new Scanner(System.in);
        System.out.println("Are you signing as a visitor or an event owner? (1 for visitor or 2 event owner)");
        int check =0;
        String uName = null;
        int option =0;
        check = in.nextInt();
        switch (check){
            case 1:
                System.out.println("Enter your username: ");
                uName = in.next();
                for(int i=0;i<Person.uname.size();i++){
                if (Person.uname.get(i).equals(uName)){
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
                else 
                    System.out.println("username doesn't exist!");
                }
                break;
            case 2:
                System.out.println("Enter your username: ");
                uName = in.next();
                for(int i=0;i<Person.uname.size();i++){
                if (Person.uname.get(i).equals(uName)){
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
    }
            default:
                System.out.println("invalid input!");
        }
    }
}
