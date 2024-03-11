package esEred4;

public class main {
    public static void main(String args[]) {

        Rettangolo rettangolo = new Rettangolo(5, 3,TipoForma.Rettangolo);
        Triangolo triangolo = new Triangolo(5,7, TipoForma.Triangolo);
        System.out.println(rettangolo.calcolaArea());
        System.out.println(triangolo.calcolaArea());


    }
}
