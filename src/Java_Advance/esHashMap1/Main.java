package Java_Advance.esHashMap1;


import java.util.AbstractMap;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String args[]) {
        Student studente1 = new Student("Davide", 29);
        Student studente2 = new Student("Carlo", 29);
        Student studente3 = new Student("Filippo", 18);
        Map<Integer,Student> studenti = new HashMap<>();
        studenti.put(1,studente1);
        studenti.put(2,studente2);
        studenti.put(3,studente3);
        System.out.println(studenti);
        Map<Integer, Student> studenti1 = Map.of(1,studente1,2,studente2,3,studente3);
        System.out.println(studenti1);
        Map<Integer, Student> studenti2 = Map.ofEntries(
                new AbstractMap.SimpleEntry<>(1,studente1),
                new AbstractMap.SimpleEntry<>(2,studente2),
                new AbstractMap.SimpleEntry<>(3,studente3)
        );
        System.out.println(studenti2);
    }
}
