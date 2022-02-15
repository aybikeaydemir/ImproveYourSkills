package Skills.CodilityLesson.Stack;

import java.util.Stack;

public class Brackets {


    public int getSolution(String S){

        Stack<String> brackets = new Stack<>();

        for (int i = 0 ; i<S.length() ; i ++)

        {
            String ch = String.valueOf(S.charAt(i));
            if (ch.equals("{") || ch.equals("[") || ch.equals("(")){
                brackets.push(ch);
            } else {
               if (!brackets.isEmpty())
                       return 0;
                   if (ch.equals("]") && ! brackets.pop().equals("[")){
                           return 0;
                   } else if (ch.equals("}") && ! brackets.pop().equals("{")){
                       return 0;
                   } else if (ch.equals(")") && ! brackets.pop().equals("(")){
                       return 0;
                   }
               }
        }
        if (!brackets.isEmpty())
            return 0;
        return 1;
    }



    public static void main (String args[]){

    }

}
