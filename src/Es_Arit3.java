public class Es_Arit3 {
    public static void main(String args[]) {
        int a = 10;
        int b = 5;
        int c = 2;
        System.out.println("la media tra " + a + " , " + b + " , " + c + " è = " + media(a,b,c));
    }
    public static float media (int a , int b, int c){
        int sum = a + b + c;
        float media = (float)sum / 3;
        return media;
    }
}