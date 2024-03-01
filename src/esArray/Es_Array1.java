public class Es_Array1 {
    public static void main(String args[]) {
        int[] numbers = array();
        System.out.println(sum(numbers));
    }
    public static int[] array (){
        int[] numbers = new int[10];
        for (int i = 0 ; i < 10 ; i++){
            numbers[i] = i+1;
        }
        return numbers;
    }
    public static int sum (int[] numbers){
        int sum = 0;
        for (int number : numbers){
            sum += number;
        }
        return sum;
    }
}