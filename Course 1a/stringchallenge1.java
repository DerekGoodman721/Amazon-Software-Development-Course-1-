public class stringchallenge1 {
/*Declare and initialize the variable firstName = “Harry”.

Declare and initialize the variable lastName = “Grow”.

Declare and initialize the variable email = “harry.grow@example.com”.

Using the method toLowerCase() and the + operator, concatenate firstName and lastName after converting it to lowercase, then assign it to the variable username. Hint: The variable username should contain “harrygrow”.

Correct the email address from “example.com” to “gmail.com”. Hint: Use the replace() method to change the email address to “harry.grow@gmail.com”.

Find the index of ‘@’ in the email address. You can use the indexOf() method for this purpose.*/

    public static void main(String args[]) {
        String firstName = "Harry";
        String lastName = "Grow";
        String email = "harry.grow@example.com";

        String username = firstName + lastName;
        username = username.toLowerCase();

        System.out.println(username);

        email = email.replace("example", "gmail");
        System.out.println(email);

        int i = email.indexOf('@');
        System.out.println(i);
        




    }



}
