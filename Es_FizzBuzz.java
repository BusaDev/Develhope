public class Es_FizzBuzz {
    public static void main(String args[]) {
        int number = 1;
        for(number = 1; number <= 100; number++){
            fizzBuzz(number);
        }
    }
    public static void fizzBuzz (int number){
        if((number%3) == 0 && (number%5) == 0){
            System.out.println(number + " FizzBuzz");
        }else if((number%5) == 0){
            System.out.println(number + " Buzz");
        }else if((number%3) == 0){
            System.out.println(number + " Fizz");
        }
    }
}