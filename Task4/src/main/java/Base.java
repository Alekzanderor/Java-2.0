import java.io.*;
import GiftTreats.*;


public class Base {
    public static void main(String[] args) throws IOException {

        ArrayWithNumbers AWN=new ArrayWithNumbers();
        AWN.FindAndReplace();

        System.out.println();
        System.out.println();

        GiftBasket GiftBasket = new GiftBasket();
        GiftBasket.weight();
        GiftBasket.price();
        GiftBasket.showInfoAll();
    }
}
