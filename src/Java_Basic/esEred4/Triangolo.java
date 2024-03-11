package esEred4;

public class Triangolo extends Forma {

    public Triangolo(double base, double altezza, TipoForma tipoForma) {
        super(base, altezza, tipoForma);
    }

    @Override
    double calcolaArea(){
        System.out.println("L'area del "+ super.getTipoForma());
        return super.getBase()*super.getAltezza()/2;
    }
}
