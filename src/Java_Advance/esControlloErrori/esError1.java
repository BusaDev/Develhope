package Java_Advance.esControlloErrori;

public class esError1 {
    public static void main(String args[]) {
        int num = 11;
        System.out.println(controlloRangeNum(num));
    }
    static boolean controlloRangeNum(int num){
        boolean result = false;
        if (num > 0 && num <= 10){
            result = true;
            System.out.println("il numero è compreso tra 1 e 10: " + num);
        }else{
            throw new ArithmeticException("il numero non è compreso tra 1 e 10, :" + num);
        }
        return result;
    }
}