import java.util.Scanner;

public class carlab {
    public static void main(String[] args) {
        boolean isEngineOn = false;
        String gear = "P";
        int speed   = 0;
        int topspeed = 100;
        int choice  = 0;
        Scanner keyBoard   = new Scanner(System.in);
        
        do{
            System.out.println("------ Car Dashboard ------"
            + "\n Speed: " + speed
            + "\n Gear: " + gear
            + "\n Engine On/Off: " + isEngineOn);


            System.out.println("------ Menu ------"
            + "\n 1. Turn On/Off Engine" 
            + "\n 2. Change Gear (P, D, R)"
            + "\n 3. Accelerate"
            + "\n 4. Break"
            + "\n 5. Exit"
            + "\n -----------------");
            System.out.print("Enter Choice: ");
            choice = keyBoard.nextInt();

            System.out.println(choice);

            switch (choice) {
                case 1:
                    isEngineOn = !isEngineOn;
                    break;
                case 2:
                    System.out.print("Enter gear (P, D, R): ");
                    gear = keyBoard.next();
                    break;
                case 3:
                    if (isEngineOn && !gear.equals("P") && speed < 100) {
                        speed += 10; // speed = speed+10
                    }   else {
                        System.out.println("Cannot accelerate (IN P OR CAN'T GO FASTER)");
                }
                    break;
                case 4:
                    if (isEngineOn && speed > 0) {
                        speed -= 5;
                    
                    }else{
                        System.out.println("Can't Break While Car Engine is not on or while the car is not moving");
                    }
                    break;
                case 5:
                        break;
                default:
                    System.out.println("Invalid Choice Please Try Again");
            }
        
        System.out.println("Turning Off");


        } while (choice != 5);
            
}
}
