import java.io.*;

//import static com.sun.org.apache.xalan.internal.xsltc.compiler.util.Type.Int;


public class Base {

    public static void main(String[] args) throws IOException  {

        Task3 CurrentTask = new Task3();
        InputStreamReader r=new InputStreamReader(System.in);
        BufferedReader br=new BufferedReader(r);


        System.out.println("Choose to do calculations (enter '1') or search array for longest word (enter '2')");

        //считываем выбор пользователя
        int choice = Integer.valueOf(br.readLine());
        //if (choice==1){ CurrentTask.Calculation();}
        //else if (choice==2){ CurrentTask.ArraySearch();}

        //запускаем нужную функциональность в соответсвии с выбором
        switch (choice){
            case 1:
                CurrentTask.Calculation();
                break;
            case 2:
                CurrentTask.ArraySearch();
                break;
            default:
                System.out.println("Unknown command");
                break;
        }

    }
}