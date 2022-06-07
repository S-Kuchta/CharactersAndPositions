import java.util.Scanner;
public class CharFromString {
    private final String word;
    private final Scanner scanner = new Scanner(System.in);
    public CharFromString(String word) {
        this.word = word;
    }


    /**
     * Function name: charFromString
     *
     * Function get position of character in word and print character on entered position.
     */
    public void charFromString() {
        System.out.println("How many characters you want to choose? ");
        int numberOfCharacters = scanner.nextInt();
        if (numberOfCharacters == 1) {
            charPosition();
        } else {
            for (int i = 0; i < numberOfCharacters; i++) {
                charPosition();
            }
        }
    }

    /**
     * Function name: charPosition
     *
     * Function get entered position
     * Function check if entered numbers are not out of word length.
     * If position is out of length of word function force you to enter number again.
     */
    private void charPosition() {
        System.out.println("Choose Position. Choose from 1 to " + (getWordLength()));

        boolean isTrue = false;
        while (!isTrue) {
            int position = scanner.nextInt();
            if (position <= getWordLength() && position > 0) {
                char charAtPosition = word.charAt((position - 1));
                System.out.println("char At position: " + (position) + " is: " + charAtPosition);
                isTrue = true;
            } else {
                System.out.println("Choose position again. Choose from 1 to " + (getWordLength()));
            }
        }
    }


    /**
     * Function name: positionInWord
     *
     * Function get entered character and print position in word.
     */
    public void positionInWord() {
        System.out.println("How many characters you want to choose? ");
        int numberOfCharacters = scanner.nextInt();
        if (numberOfCharacters == 1) {
            positionOfCharacter();
        } else {
            for (int i = 0; i < numberOfCharacters; i++) {
                System.out.println("Choose next character from: " + word);
                positionOfCharacter();
            }
        }
    }

    /**
     * Function name: positionOfCharacter
     *
     * Function get entered characters and check if entered word contains it.
     */
    private void positionOfCharacter() {
        String wordToLowerCase = word.toLowerCase();
        boolean isTrue = false;
        System.out.println("Choose character from: " + word);

        while (!isTrue) {
            String enteredCharacter = scanner.next().toLowerCase();
            int indexOf = wordToLowerCase.indexOf(enteredCharacter);

            if(!wordToLowerCase.contains(enteredCharacter) || enteredCharacter.isEmpty()) {
                System.out.println("Entered character '" + enteredCharacter + "' is not found in word " + word);
                System.out.println("enter character which is in word: " + word);
            } else {
                System.out.print("position of character(s) '" + enteredCharacter + "' in word " + word + " is(are): ");
                while (indexOf >= 0) {
                    System.out.print((indexOf + 1) + ", ");
                    indexOf = word.indexOf(enteredCharacter,indexOf + 1);
                }
                System.out.println("\n");
                isTrue = true;
            }
        }
    }
    private int getWordLength() {
        return word.length();
    }
}