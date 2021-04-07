
import java.io.*;


public class Base {

    public static void main(String[] args) throws IOException  {

        InputStreamReader r=new InputStreamReader(System.in);
        BufferedReader br=new BufferedReader(r);
        System.out.println("Enter first number");
        Float firstN= Float.valueOf(br.readLine());
        System.out.println("Enter second number");
        Float secondN= Float.valueOf(br.readLine());
        System.out.println("Choose operand type");
        String operand = br.readLine();
        if (operand.equals("+")) { System.out.println(firstN+secondN) ;}
            else if (operand.equals("-")) {System.out.println(firstN-secondN);}
            else if (operand.equals("*")) {System.out.println(firstN*secondN);}
            else if (operand.equals("/")) {System.out.println(firstN / secondN);}
            else { System.out.println("Incorrect operand" + "operand"); }
    }
}
