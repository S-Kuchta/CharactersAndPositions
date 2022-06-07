import java.util.Scanner;

public class Main {
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("enter random word: ");
        String randomWord = scanner.nextLine();

        CharFromString charFromString = new CharFromString(randomWord);

        System.out.println("type 1: to show character from word");
        System.out.println("type 2: to show character position");
        int select = scanner.nextInt();

        if(select == 1) {
            charFromString.charFromString();
        } else {
            charFromString.positionInWord();
        }

    }
}