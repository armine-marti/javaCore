package homework.braceChecker;

public class BraceChecker {
    public String text;

    public BraceChecker(String text){
        this.text = text;
    }
    public void check(){
        Stack braceArray = new Stack();
        for (int i = 0; i<text.length();i++){
            char x = text.charAt(i);
            char y;

            switch (x) {
                case ('{'):
                case ('['):
                case ('('):
                    braceArray.push(x);
                    break;
                case'}':
                    y = (char)braceArray.pop();
                    if(y != '{'){
                        System.out.println("Error at " +i + ". " + "opened "+ y +"but closed " + x);
                    }
                    break;
                case(']'):
                    y = (char)braceArray.pop();
                    if(y !='['){
                        System.out.println("Error at " +i + ". " + "opened "+ y +"but closed " + x);
                    }
                    break;
                case(')'):
                    y = (char)braceArray.pop();
                    if(y !='('){
                        System.out.println("Error at " +i + ". " + "opened "+ y +"but closed " + x);
                    }
                    break;
            }
        }
    }

}
