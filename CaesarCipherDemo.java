import java.util.Scanner;

/**
 * Demonstrates the CaesarCipher class
 *
 * @author gcschmit
 * @version 21 September 2018
 */
public class CaesarCipherDemo
{
    public static void main(String[] args)
    {
        /*
         * A Scanner object parses primitive types and Strings from a stream.
         * 
         *  A stream is a sequence of characters from a file, String, terminal,
         *      network connection, etc.
         *      
         *  Parsing is separating a sequence of characters into tokens based on
         *      delimiters.
         *      
         *      A token is a meaningful sequence of characters (e.g., word).
         *      
         *      Delimiters are characters that separate tokens
         *          (by default, whitespace (space, tab, newline)).
         *          
         *  When we create a Scanner object, we have to specify the input stream
         *      (e.g., System.in which is the terminal input).
         */
        Scanner s = new Scanner(System.in);
        
        /*
         * Best practices:
         *      1. prompt the user for what you want them to input
         *      2. use print, not println; so that the cursor is at the end of the
         *          prompt and not on a new line
         *      3. leave a space after the prompt
         */
        System.out.print("Enter the text to encrypt: ");
        
        /*
         * The nextLine method returns all the characters up to the end of the line
         *      (e.g., where the user typed enter).
         */
        String text = s.nextLine();
        text = text.toUpperCase();
        
        System.out.print("Enter the keyphrase (no spaces): ");
        
        /*
         * The next method returns the next token in the stream as a String
         */
        String keyphrase = s.next();
        keyphrase = keyphrase.toUpperCase();
        
        System.out.print("Enter the number of seconds to test a guessed keyphrase: ");
        
        /*
         * The nextInt method attempts to convert the next token in the stream to an
         *      int and returns the value. If the next token cannot be converted, an
         *      exception is generated.
         *      
         *  The nextDouble method behaves in the same way for doubles.
         */
        int secondsPerGuess = s.nextInt();
        
        CaesarCipher cipher = new CaesarCipher(keyphrase);
        String complexityDesc = cipher.getComplexityDescription(secondsPerGuess);
        System.out.println("Complexity: " + complexityDesc);
        
        String encryptedText = cipher.encrypt(text);
        System.out.println("Encrypted: " + encryptedText);
    }
}