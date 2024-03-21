package Java_Advance.esArrayList1;
import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String args[]) {
        Student studente1 = new Student("Davide", 29);
        Student studente2 = new Student("Carlo", 29);
        Student studente3 = new Student("Filippo", 18);
        Student studente4 = new Student("Marta", 20);
        Student studente5 = new Student("Julia", 29);
        Student studente6 = new Student("Barbara", 25);
        ArrayList<Student> studenti = new ArrayList<>(Arrays.asList(studente1, studente2));
        for (Student studente : studenti) {
            System.out.println(studente);
        }
        studenti.add(studente3);
        studenti.add(studente4);
        studenti.add(studente5);
        studenti.add(studente6);
        System.out.println("\naggiunti nuovi studenti");
        for (Student studente : studenti) {
            System.out.println(studente);
        }
    }
}
