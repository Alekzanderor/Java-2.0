import java.io.*;

public class Task3  {

    InputStreamReader r=new InputStreamReader(System.in);
    BufferedReader br=new BufferedReader(r);

    //System.out.println("Choose to do calculations (enter '1') or search array for longest word (enter '2' ");

    /**
     * калькулятор
     * @throws IOException
     */
    public void Calculation() throws IOException {

        //считываем пользовательский ввод
        System.out.println("Enter first number");
        Float firstN= Float.valueOf(br.readLine());
        System.out.println("Enter second number");
        Float secondN= Float.valueOf(br.readLine());
        System.out.println("Choose operator");
        String operator = br.readLine();


        if (operator.equals("+")) { System.out.printf("%.4f", firstN+secondN) ;}
        else if (operator.equals("-")) {System.out.println(firstN-secondN);}
        else if (operator.equals("*")) {System.out.println(firstN*secondN);}
        else if (operator.equals("/")) {System.out.println(firstN / secondN);}
        else { System.out.println("Incorrect operand" + "operand"); }
    }

    /**
     * Поиск самого длинного слова в массиве
     * @throws IOException
     */
    public void ArraySearch() throws IOException {

        System.out.println("Input length for array^");
        int Length = Integer.valueOf(br.readLine());

        String[] StringArray = new String[Length];
        int i = 0;
        while (i < Length) {
            System.out.println("Enter next word");
            StringArray[i] = br.readLine();
            i++;
        }
        int maxLength = 0;
        String longetsWord = new String();
        for (String word : StringArray) {
            if (word.length() > maxLength) {
                maxLength = word.length();
                longetsWord = word;
            }
        }
        System.out.println("Longest word:" + longetsWord);
    }
}
