/**
 * This class implements the functionality to represent a String as a Number
 */
public class StringAsNumber {
    /**
     * This method calculates the sum of all letters of the given String.
     * Every letter is equivalent to the number of its position in the english alphabet.
     * @param text String to calculate the sum of
     * @return sum of the letters
     */
    public int sumOfString(String text) {
        //Transform input to uppercase and remove whitespaces
        String formattedText = text.toUpperCase().replaceAll("\\s", "");
        int sum = 0;
        //Iterate over all characters
        for (int i = 0; i < formattedText.length(); i++) {
            char currentChar = formattedText.charAt(i);
            //Check if current character is part of the english alphabet
            if ((currentChar >= 'A') && (currentChar <= 'Z')) {
                sum += ((currentChar - 'A') + 1); //Calculate corresponding number and add to sum
            }
        }
        return sum;
    }
}
