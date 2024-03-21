package Java_Advance.esArrayList2;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

public class Main {
    public static void main(String args[]) {
        Student studente1 = new Student("Davide", 29);
        Student studente2 = new Student("Carlo", 30);
        Student studente3 = new Student("Zorro", 19);
        Student studente4 = new Student("Pippo", 59);
        Student studente5 = new Student("Maddalena", 70);
        Student studente6 = new Student("Julia", 10);
        Student studente7 = new Student("Agata", 22);
        Student studente8 = new Student("Angelo", 25);
        Student studente9 = new Student("Danilo", 23);
        Student studente10 = new Student("Sandra", 22);
        Student studente11 = new Student("Luca", 28);
        Student studente12 = new Student("Elena", 26);


        ArrayList<Student> studenti = new ArrayList<>(Arrays.asList(studente1,studente2,studente3,studente4,studente5,studente6,studente7,studente8, studente9, studente10,studente11,studente12));



        for (Student studente : studenti){
            System.out.println(studente);
        }
        System.out.println("\nArray ordinato per nome:\n");
        studenti.sort(Comparator.comparing(student -> student.getName()));
        for (Student studente : studenti){
            System.out.println(studente);
        }

        System.out.println("\nArray ordinato per età:\n");
        studenti.sort(Comparator.comparing(student -> student.getAge()));
        for (Student studente : studenti){
            System.out.println(studente);
        }

    }
}
