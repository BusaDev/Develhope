package Java_Advance.esAutoboxUnbox;

public class esBox {
    public static void main(String args[]) {
        Integer numInteger1 = 2;
        Integer numInteger2 = 3;
        Double numDouble1 = 1.5;
        double numDouble2 = numDouble1;
        int numInt1 = numInteger1;
        int numInt2 = numInteger2;
        Character carattere = 'b';
        char carattere1 = carattere;
        stampaInt(numInt1,numInt2);
        stampaInteger(numInteger1, numInteger2);
        stampaChar(carattere1);
        stampaCharacter(carattere);
    }
    static void stampaInt(int a, int b){
        int c = a+b;
        System.out.println(c);
    }
    static void stampaInteger(Integer a, Integer b){
        Integer c = a+b;
        System.out.println(c);
    }
    static void stampaChar(char a){
        System.out.println(a);
    }
    static void stampaCharacter(Character a){
        System.out.println(a);
    }
}
