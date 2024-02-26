public class Es_CicliAvanzati1 {
    public static void main(String args[]) {
        int number = 7;
        stampa(number);
    }
    public static void stampa (int number){
        for(int i = 0; i < number; i++){
            if(i == 5){
                break;
            }
            System.out.println(i);
        }
    }
}