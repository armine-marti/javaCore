package homework.braceChecker;

public class BraceChecker {
    public String text;

    public BraceChecker(String text){
        this.text = text;
    }
    Brace type1 = new Brace('{');
    Brace type2 = new Brace('[');
    Brace type3 = new Brace('(');


    public void check(){
        Stack braceArray = new Stack();
        for (int i = 0; i<text.length();i++){
            Brace first = new Brace();
            first.brace = text.charAt(i);
            Brace last = new Brace();
            //x= text.charAt(i);
            //char y;


            switch (first.brace) {
                case ('{'):
                case ('['):
                case ('('):
                    braceArray.push(first.brace);
                    break;
                case'}':
                    last.index = braceArray.pop();
                    if(last.index != '{'){
                        System.out.println("Error at " +i + ". " + "opened "+ last +"but closed " + first);
                    }
                    break;
                case(']'):
                    last.index = braceArray.pop();
                    if(last.index !='['){
                        System.out.println("Error at " +i + ". " + "opened "+ last +"but closed " + first);
                    }
                    break;
                case(')'):
                    last.index = braceArray.pop();
                    if(last.index !='('){
                        System.out.println("Error at " +i + ". " + "opened "+ last +"but closed " + first);
                    }
                    break;
            }
        }
    }

}
