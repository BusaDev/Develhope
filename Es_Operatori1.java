public class Es_Operatori1 {
    public static void main(String args[]) {
        int a = 10;
        int b = 5;
        System.out.println(operator(a,b));
    }
    public static int operator (int a , int b){
        a += 2;
        b += 5;
        int molt = a * b; 
        return molt;
    }
}