package esGetSet3;

public class Main {
    public static void main(String args[]) {
        Auto auto1 = new Auto("1742", "FE000FE", "Alfa Romeo", "Giulietta");
        System.out.println(auto1.getCilindrata() + " " + auto1.getTarga() + " " + auto1.getMarca() + " " + auto1.getModello());
        auto1.setTarga("AA000BB");
        System.out.println(auto1.getCilindrata() + " " + auto1.getTarga() + " " + auto1.getMarca() + " " + auto1.getModello());
    }
}
