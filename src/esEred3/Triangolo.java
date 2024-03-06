package esEred3;
public class Triangolo implements Forma {
    double base;
    double altezza;

    public Triangolo(double base, double altezza) {
        this.base = base;
        this.altezza = altezza;
    }
    @Override
    public double calcolaArea(){
        return base * altezza/2;
    }
}
