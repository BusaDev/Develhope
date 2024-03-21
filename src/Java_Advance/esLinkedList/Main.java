package Java_Advance.esLinkedList;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.LinkedList;

public class Main {
    public static void main(String args[]) {
        Fruit frutto1 = new Fruit("Mela");
        Fruit frutto2 = new Fruit("Pera");
        LinkedList<Fruit>frutti = new LinkedList<>(Arrays.asList(frutto1,frutto2));
        System.out.println(frutti);
        frutti.addFirst(new Fruit("Ciliegia"));
        frutti.addLast(new Fruit("Mango"));
        System.out.println(frutti);
    }
}
