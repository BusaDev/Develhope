package esEred4;
enum TipoForma{
    Rettangolo,
    Triangolo
}
public abstract class Forma {
    private double base;
    private double altezza;
    private final TipoForma tipoForma;
    public Forma(double base, double altezza, TipoForma tipoForma) {
        this.base = base;
        this.altezza = altezza;
        this.tipoForma = tipoForma;
    }

    public double getBase() {
        return base;
    }

    public double getAltezza() {
        return altezza;
    }

    public TipoForma getTipoForma() {
        return tipoForma;
    }

    abstract double calcolaArea();
}
