import java.util.Scanner;

public class schedule {
    public static void main(String []args) {

     Scanner keyboard = new Scanner(System.in);
     int daysOfTheWeek = 0;
     int subchoice = 0;
    
     System.out.println("------MENU------"
    + "\nThese are the choices for the week of the day"
    + "\nPlease enter values from 1-7:"
    + "\n1. MONDAY"
    + "\n2. TUESDAY"
    + "\n3. WEDNESDAY"
    + "\n4, THURSDAY"
    + "\n5. FRIDAY"
    + "\n6. SATURDAY"
    + "\n7. SUNDAY"
    + "\n----------------");
        

    System.out.print("Enter Choice: ");
    daysOfTheWeek = keyboard.nextInt();

        switch(daysOfTheWeek){
            case 1:
                System.out.println("Monday: It is back to work....");
                System.out.println("Have You Had Breakfast?");
                System.out.println("------SUBMENU------"
                + "\n1. Yes, I had my breakfast"
                + "\n2. No, i would like one"
                + "\n----------------");
                System.out.print("Enter Choice: ");
                subchoice = keyboard.nextInt();

                if (subchoice == 1){
                    System.out.println("Good. Now you have a catchup meeting at 9AM Prepare your notes");
                }
                else if (subchoice == 2){
                    System.out.println("Let us divert on Highway 54 and have a burger on the drive in");
                }
                else{
                    System.out.println("NO such choice availible");
                }
                break;  
            case 2:
                System.out.println("Tuesday: It is back to work....");
                System.out.println("What language are you going to use for coding time?");
                System.out.println("------SUBMENU------"
                + "\n1. Java"
                + "\n2. C++"
                + "\n----------------");
                System.out.print("Enter Choice: ");
                subchoice = keyboard.nextInt();

                switch(subchoice){
                    case 1:
                        System.out.println("Let us start coding with Java");
                        break;
                    case 2:
                        System.out.println("Let us start coding with C++");
                        break;
                    default:
                        System.out.println("NO such choice availible");
                        break;
                }
                break;
            case 3:
                System.out.println("Wednesday: It is back to work....");
                System.out.println("Simple or Complex Design");
                System.out.println("------SUBMENU------"
                + "\n1. Simple"
                + "\n2. Complex"
                + "\n----------------");
                System.out.print("Enter Choice: ");
                subchoice = keyboard.nextInt();

                if (subchoice == 1){
                    System.out.println("lets make it simple");
                }
                else if (subchoice == 2){
                    System.out.println("lets make it complex");
                }
                else{
                    System.out.println("NO such choice availible");
                }
                break;
            case 4:
                System.out.println("Thursday: It is back to work....");
                 System.out.println("What IDE are you going to use");
                System.out.println("------SUBMENU------"
                + "\n1. IntelliJ"
                + "\n2. Eclipse"
                + "\n3. C++"
                + "\n----------------");
                System.out.print("Enter Choice: ");
                subchoice = keyboard.nextInt();

                switch(subchoice){
                    case 1:
                        System.out.println("Let us start coding with IntelliJ");
                        break;
                    case 2:
                        System.out.println("Let us start coding with Eclipse");
                        break;
                    case 3:
                        System.out.println("Let us start coding with VS Code");
                    default:
                        System.out.println("NO such choice availible");
                        break;
                }
                break;
            case 5:
                System.out.println("Friday: It is back to work....");
                System.out.println("Did the tests go well?");
                System.out.println("------SUBMENU------"
                + "\n1. Yes"
                + "\n2. No"
                + "\n----------------");
                System.out.print("Enter Choice: ");
                subchoice = keyboard.nextInt();

                if (subchoice == 1){
                    System.out.println("Woohoo");
                }
                else if (subchoice == 2){
                    System.out.println("Boohoo");
                    System.out.println("Cheer Up Lets Go Have Fun!");
                    System.out.println("------SUBMENU------"
                    + "\n1. At home"
                    + "\n2. In bar"
                    + "\n3. With friends"
                    + "\n4. at a nightclub"
                    + "\n----------------");
                    System.out.print("Enter Choice: ");
                    subchoice = keyboard.nextInt();
                    
                    if (subchoice == 1){
                        System.out.println("Movie Time!");
                    }
                    else{
                        System.out.println("Party!");
                    }
                    
                }
                else{
                    System.out.println("NO such choice availible");
                }
                break;
            case 6:
                System.out.println("Saturday: Time to rest....");
                System.out.println("Sleep In or Wake Up");
                System.out.println("------SUBMENU------"
                + "\n1. Sleep"
                + "\n2. Wake up"
                + "\n----------------");
                System.out.print("Enter Choice: ");
                subchoice = keyboard.nextInt();

                if (subchoice == 1){
                    System.out.println("ZZZZZ");
                }
                else if (subchoice == 2){
                    System.out.println("Rise and Shine!");
                }
                else{
                    System.out.println("NO such choice availible");
                }
                break;
            case 7:
                System.out.println("Sunday: Time to rest....");
                System.out.println("Sleep In or Wake Up?");
                System.out.println("------SUBMENU------"
                + "\n1. Sleep"
                + "\n2. Wake Up"
                + "\n----------------");
                System.out.print("Enter Choice: ");
                subchoice = keyboard.nextInt();

                switch(subchoice){
                    case 1:
                        System.out.println("ZZZZZ");
                        break;
                    case 2:
                        System.out.println("Rise & Shine");
                        break;
                    default:
                        System.out.println("NO such choice availible");
                        break;
                }
                break;

            default:
                System.out.println("\nPlease Enter A Proper Value (1-7)");
            }
        
    }





        


} 

