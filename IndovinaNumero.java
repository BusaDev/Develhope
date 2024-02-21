import java.util.Scanner;
public class IndovinaNumero {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in) ;
        System.out.println("Indovina il Numero!!");
        int guessNumber = scanner.nextInt();
        random(guessNumber);
    }
    public static void random (int guess){
        int randomNumber = (int) (Math.random()*100);
        if (guess == randomNumber){
            System.out.println("Complimenti hai indovinato!!!");
        }else{
            System.out.println("Peccato hai sbagliato, il numero corretto era :" + randomNumber);
        }
    }

}