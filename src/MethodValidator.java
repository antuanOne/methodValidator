import java.util.Stack;

/**
 * Created by Usuario on 23/06/2016.
 */
public class MethodValidator {

    public boolean isValidMethod(String method) {

        char[] methodArray = method.toCharArray();
        Stack parenthesisStack = new Stack();
        Stack bracketStack = new Stack();


        for (char character : methodArray) {

            switch (character){
                case '(' : parenthesisStack.push(character);
                    break;
                case ')' : parenthesisStack.pop();
                    break;
                case '[' : bracketStack.push(character);
                    break;
                case ']' : bracketStack.pop();
                    break;
            }
        }
        return (parenthesisStack.isEmpty() && bracketStack.isEmpty());

    }
}
