package homework.braceChecker;

public class BraceChecker {
    public String text;

    public BraceChecker(String text) {
        this.text = text;
    }

    public void check() {
        Stack myStack = new Stack();
        for (int i = 0; i < text.length(); i++) {
            char c = text.charAt(i);

            char last;
            Brace pop;

            //x= text.charAt(i);
            //char y;


            switch (c) {
                case ('{'):
                case ('['):
                case ('('):
                    myStack.push(new Brace(c,i));
                    break;
                case '}':
                     pop = myStack.pop();
                    if (pop == null) {
                        System.out.println("Error: Closed at " + c + "but not opened" + i);
                    } else {

                        if (pop.getBrace() != '{') {
                            System.out.println("Error: closed " + c + "but opoened" + pop.getBrace() + "at" + i);
                        }
                    }
                    break;
                case ']':
                    pop = myStack.pop();
                    if (pop == null) {
                        System.out.println("Error: Closed at " + c + "but not opened at" + i);
                    } else {

                        if (pop.getBrace() != '[') {
                            System.out.println("Error: closed " + c + "but opoened" + pop.getBrace() + "at" + i);
                        }
                    }
                    break;
                case ')':
                    pop = myStack.pop();

                    if (pop == null) {
                        System.out.println("Error: Closed at " + c + "but opened " + pop.getBrace() + "at" + i);
                    } else {

                        if (pop.getBrace() != '(') {
                            System.out.println("Error: closed " + c + "but opoened" + pop.getBrace() + "at " + i);
                        }
                    }
                    break;
            }
        }
        //int last;
        //while((last=myStack.pop()) !=0){

        // System.out.println("error opened " + (char)last+ "but not closed");
        //} OR

        while (!myStack.isEmpty()) {
            Brace pop = myStack.pop();
            System.out.println("error opoened: " +pop.getBrace() + "but not closed at" +pop.getIndex());
        }
    }
}
