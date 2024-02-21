public class Es_While {
    public static void main(String args[]) {
        int number = 5;
        System.out.println(sumOf(number));
    }
    public static int sumOf (int number){
    int i = 0; 
    int result = 0;   
        while (i < number){
            result += i;
            i++;
        }
        return result;
    }
}