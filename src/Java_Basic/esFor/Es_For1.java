public class Es_For1 {
    public static void main(String args[]) {
        int number = 5;
        System.out.println("la tabellina del "+ number);
        tabellina(number);
    }
    public static void tabellina (int number){
        for(int i = 1; i <= 10; i++){
            System.out.println(i * number);
        }
    }
}