public class Es_OpLogic1 {
    public static void main(String args[]) {
        int lowerNumber = 5;
        int biggerNumber = 10;
        int compNumber = 4;
        System.out.println("il numero inferiore è" + lowerNumber + " il numero maggiore è " + biggerNumber);
        System.out.println(compNumber + " è compreso tra i due numeri? " + included(lowerNumber,biggerNumber,compNumber));

    }
    public static boolean included (int lowerNumber, int biggerNumber, int compNumber){
        return (compNumber >= lowerNumber && compNumber <= biggerNumber);  
    }
}