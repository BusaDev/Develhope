package esEred2;
public abstract class Forma {
    public double base;
    public double altezza;

    public Forma(double base, double altezza) {
        this.base = base;
        this.altezza = altezza;
    }

    abstract double calcolaArea();
}
