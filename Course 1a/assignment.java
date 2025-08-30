public class assignment {
    public static void main(String[] args) {
        
        String firstName = "Sandy";
        String lastName = "Jones";
        String movieTitle = "The Source Code";
        int movieTickets = 8;
        double price = 10.57;

        double totalSum = price*movieTickets;

        String userName = firstName.toLowerCase() + lastName.toLowerCase();
        String movieName = movieTitle.toUpperCase();

        System.out.println("Congratulations!! You have successfully booked the tickets");
        System.out.println("Username: " + userName);
        System.out.println("Movie: " + movieName);
        System.out.println("Number of Tickets: " + movieTickets);
        System.out.println("Price per ticket: " + price);
        System.out.println("Total price of 8 tickets:" + totalSum);
        System.out.println("Thank you for choosing us for booking your movie tickets");
        System.out.println("Enjoy your movie!!!");
        
        
   }
}
