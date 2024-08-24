package homework.braceChecker;

public class BraceCheckerTest {
    public static void main(String[] args) {
        BraceChecker firstSentence = new BraceChecker("Hello from [ Java]");
        firstSentence.check();
        System.out.println();

        BraceChecker secondSentence = new BraceChecker("Hello from [Java)");
        secondSentence.check();

        BraceChecker thirdSentence = new BraceChecker("(())Hello Java");
        thirdSentence.check();
    }

}
