package Java_Advance.esNullability;

public class esNull1 {
    public static void main(String args[]) {
        int numeratore = 1;
        int denominatore = 2;
        controlloNull(numeratore,denominatore);
    }
    static void controlloNull(int a, int b){
        int c;
        try{
            c = a + b;
            System.out.println(a + " + " + b + " = " + c);
        }catch(NullPointerException e){
            System.out.println("manca il valore");
        }
    }
}