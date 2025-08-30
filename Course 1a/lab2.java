public class lab2 {
    public static void main(String[] args) {
    
        String bookTitle = "The Adventures of Captain Fantastic and the Magical Unicorn";
        int titleLength = bookTitle.length();
        System.out.println("Length of the book title: " + titleLength);

        int maxLength = 20;

        if (titleLength > maxLength);
            String shortBookTitle = bookTitle.substring(0, 19);

        System.out.println(shortBookTitle);

        // Declare and initialize the searchWord
        String searchWord = "Captain";

        // Check if the searchWord is present in book title
        boolean containsWord = bookTitle.contains("Captain");
        System.out.println("Does the title contain the word \"" + searchWord + "\"? " + containsWord);

        ////////////////////////////////////////////////////////////////////////////////////////////////
        
        String sentence = "Java programming is fun and educational";

        boolean checkSentence = sentence.contains("fun");
        System.out.println(checkSentence);

        String newSentence =  sentence.replace("educational", "awesome");
        System.out.println(newSentence);

        System.out.println(sentence.length());

        if (sentence.length() > 17);
            String shortenedSentence = sentence.substring(0, 17);

        System.out.println(shortenedSentence);
   }
}
