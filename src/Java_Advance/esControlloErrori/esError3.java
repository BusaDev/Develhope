package Java_Advance.esControlloErrori;
// onestamente sarò scemo io, ma la traccia non l'ho prorpio capita.
// questo è l'esercizio che ho interpretato dalla traccia:
public class esError3 {
    public static void main(String args[]) {
        int[] num = {1,2,3,4,5,6};
        divideByZero(num);
    }
    static void divideByZero(int[] num) {
        int result;

        for (int i = 0; i < 10; i++) {
            try {
                result = num[i] / i;
                System.out.println(num[i] + " / " + i + " = " + result);
            }catch (ArithmeticException e){
                System.out.println("Errore stai dividendo per 0");
            }catch (Exception e){
                System.out.println("Errore l'array è terminato");
            }
        }
    }
}