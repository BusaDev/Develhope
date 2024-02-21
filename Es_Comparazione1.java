public class Es_Comparazione1 {
    public static void main(String args[]) {
        int firstNumber = 5;
        int secondNumber = 5;
        System.out.println("il primo numero è " + firstNumber + " il secondo numero è " + secondNumber + equal(firstNumber, secondNumber));

    }
    public static String equal (int firstNumber, int secondNumber){
        if (firstNumber == secondNumber){
            String result = " I due numeri sono uguali";
            return result;
        }else{
            String result = " I due numeri sono diversi";
            return result;
        }       
    }
}