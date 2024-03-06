package esEred2;
public class Rettangolo extends Forma {
    public Rettangolo(double base, double altezza) {
        super(base, altezza);
    }
    @Override
    double calcolaArea(){
        return base * altezza;
    }
}
