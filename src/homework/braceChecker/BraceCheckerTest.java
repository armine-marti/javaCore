package homework.braceChecker;

import java.util.Scanner;

public class BraceCheckerTest {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        BraceChecker firstSentence = new BraceChecker();
        System.out.println("Please type in  your sentence : ");
        firstSentence.text = scan.nextLine();
        firstSentence.text = "Hello from [ Java]";

        firstSentence.check();

        System.out.println();

        BraceChecker secondSentence = new BraceChecker();
        secondSentence.text = scan.nextLine();
        secondSentence.text = "Hello from [Java)";
        secondSentence.check();

        System.out.println();


        BraceChecker thirdSentence = new BraceChecker();
        thirdSentence.text = "(())Hello Java";
thirdSentence.text = scan.nextLine();
        thirdSentence.check();
    }

}
