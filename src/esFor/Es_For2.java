public class Es_For2 {
    public static void main(String args[]) {
        int number = 10;
        int limite = 3;
        stampa(number, limite);
    }
    public static void stampa (int number, int limite){
        for(int i = number; i > limite; i--){
            System.out.println(i);
            
        }
    }
}