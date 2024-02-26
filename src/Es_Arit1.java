public class Es_Arit1 {
    public static void main(String args[]) {
        int a = 10;
        int b = 5;
        System.out.println("la divisione tra " + a + " e " + b + " è = " + divOf(a,b) + ", il resto è =" + resto (a,b));
    }
    public static int divOf (int a , int b){
        int div = a / b;
        return div;
    }
    public static int resto (int a , int b){
        int resto = a % b;
        return resto;
    }
}