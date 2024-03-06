package esEred3;
public class Rettangolo implements Forma {
    double base;
    double altezza;

    public Rettangolo(double base, double altezza) {
        this.base = base;
        this.altezza = altezza;
    }

    @Override
    public double calcolaArea(){
        return base * altezza;
    }
}
