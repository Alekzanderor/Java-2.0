
import java.io.*;


public class Base {

    public static void main(String[] args) throws IOException  {

        InputStreamReader r=new InputStreamReader(System.in);
        BufferedReader br=new BufferedReader(r);

        //считываем пользовательский ввод
        System.out.println("Enter first number");
        Float firstN= Float.valueOf(br.readLine());
        System.out.println("Enter second number");
        Float secondN= Float.valueOf(br.readLine());
        System.out.println("Choose operator");
        String operator = br.readLine();

        /**
         * проверяя операнд с помощью if else производим операцию с введенным значениями
         * @author Орехов Александр
         */
        if (operator.equals("+")) { System.out.printf("%.4f", firstN+secondN) ;}
            else if (operator.equals("-")) {System.out.println(firstN-secondN);}
            else if (operator.equals("*")) {System.out.println(firstN*secondN);}
            else if (operator.equals("/")) {System.out.println(firstN / secondN);}
            else { System.out.println("Incorrect operand" + "operand"); }
    }
}
