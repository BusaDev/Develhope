package Java_Advance.esControlloErrori;

public class esError2 {
    public static void main(String args[]) {
        int num = 10;
        divideByZero(num);
    }
    static void divideByZero(int num){
        try {
            num = num/0;
        }catch (Exception e){
            System.out.println("errore stai dividendo per 0");
        }
    }
}