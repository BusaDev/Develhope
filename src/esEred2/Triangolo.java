package esEred2;

public class Triangolo extends Forma {
    public Triangolo(double base, double altezza) {
        super(base, altezza);
    }
    @Override
    double calcolaArea(){
        return base * altezza/2;
    }
}
