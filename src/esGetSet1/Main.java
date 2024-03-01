package Es_Get_Set1;

public class Main {
    public static void main(String args[]) {
        Studenti studente1 = new Studenti("Davide", "Busà", "1995", 01);
        System.out.println(studente1.getName() + " " + studente1.getSurname() + " " + studente1.getBirthYear() + " " + studente1.getId());
    }
}
