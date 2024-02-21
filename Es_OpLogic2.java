public class Es_OpLogic2 {
    public static void main(String args[]) {
        int number = 3;
        pair(number);
    }
    public static void pair (int number){
        if((number%2) != 0){
            System.out.println("il numero " + number + " è dispari");
        }else{
            System.out.println("il numero " + number + " è pari");
        }
    }
}