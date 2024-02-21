public class Es_For2 {
    public static void main(String args[]) {
        int number = 5;
        int limite = 3;
        stampa(number, limite);
    }
    public static void stampa (int number, int limite){
        for(int i = 0; i < limite; i++){
            System.out.println(number);
            number --;
        }
    }
}