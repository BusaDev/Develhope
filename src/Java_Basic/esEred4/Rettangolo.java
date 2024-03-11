package esEred4;

public class Rettangolo extends Forma {
    public Rettangolo(double base, double altezza, TipoForma tipoForma) {
        super(base, altezza, tipoForma);
    }

    @Override
    double calcolaArea(){
        System.out.println("L'area del "+ super.getTipoForma());
        return super.getBase() * super.getAltezza();
    }
}
