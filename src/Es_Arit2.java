public class Es_Arit2 {
    public static void main(String args[]) {
        int a = 10;
        int b = 5;
        int c = 2;
        System.out.println("la divisione tra " + a + " , " + b + " , " + c + " è = " + divOf(a,b,c));
    }
    public static int divOf (int a , int b, int c){
        int div = a / b / c;
        return div;
    }
}