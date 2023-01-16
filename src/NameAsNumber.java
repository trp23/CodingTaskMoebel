public class NameAsNumber {
    /**
     * This method calculates the sum of all letters of the given String.
     * Every letter is equivalent to the number of its position in the english alphabet.
     * @param name String to calculate the sum of
     * @return sum of the letters
     */
    public int calculateSumOfName(String name) {
        //Transform input to uppercase and remove whitespaces
        String nameInUppercase = name.toUpperCase().replaceAll("\\s", "");
        int sum = 0;
        //Iterate over all characters
        for (int i = 0; i < nameInUppercase.length(); i++) {
            char currentChar = nameInUppercase.charAt(i);
            //Check if current character is part of the english alphabet
            if ((currentChar >= 'A') && (currentChar <= 'Z')) {
                sum += ((currentChar - 'A') + 1); //Calculate corresponding number and add to sum
            }
        }
        return sum;
    }
}
