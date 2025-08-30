public class string1 {
    public static void main(String args[]) {
        String text = "Adventure";

        // TODO: Check the length using length() and print the length
        int length = text.length();
        System.out.println(length);
        
        // TODO: Get the character at position 3 and print the character    
        char position = text.charAt(3);
        System.out.println(position);
        // TODO: Get a part of the String from position 1 to 4 and print the string
        String portion = text.substring(1,4);
        System.out.println(portion);

        String anotherText= "Adventure";
        // TODO: Compare text with anotherText using equals() and print the output
        boolean result = anotherText.equals(text);
        System.out.println(result);
        // TODO: Change to uppercase using toUpperCase() and print the converted string
        String upper = text.toUpperCase();
        System.out.println(upper);
        // TODO: Change to lowercase using toLowerCase() and print the converted string
        String lower = text.toLowerCase();
        System.out.println(lower);
        // TODO: Check if it contains "vent" using contains() and print the output
        boolean result2 = text.contains("vent");
        System.out.println(result2);
        // TODO: Replace 'e' with 'a' and print the output
        String newWord = text.replace('e','a');
        System.out.println(newWord);
    }
}

