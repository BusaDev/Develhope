import java.util.Scanner;
public class IndovinaNumero {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Indovina il Numero!!");
        int guessNumber = scanner.nextInt();
        int risposta = 1;
        random(guessNumber);
        while (risposta != 0){
            System.out.println("vuoi giocare ancora? premi 1 per si o 0 per terminare il programma");
            risposta = scanner.nextInt();
            if (risposta == 1){
                System.out.println("Inserisci un nuovo numero");
                guessNumber = scanner.nextInt();
                random(guessNumber);
            }else if(risposta == 0){
                System.out.println("Arrivederci");
                scanner.close();
            }else{
                System.out.println("input errato");
            }
        }   

    }
    public static void random (int guess){
        int randomNumber = (int) (Math.random()*100);
        if (guess == randomNumber){
            System.out.println("Complimenti hai indovinato!!!");
        }else{
            System.out.println("Peccato hai sbagliato, il numero corretto era: " + randomNumber);
        }
    }

}