public class Es_Switch2 {
    public static void main(String args[]) {
        char op = '+';
        operator(op);
    }
    public static void operator (char op){
        switch (op) {
            case ('+') :
                System.out.println(op + " Addizione");
                break;
            case ('-') :
                System.out.println(op + " Sottrazione");
                break;
            case ('*') :
                System.out.println(op + " Moltiplicazione");
                break;
            case ('/') :
                System.out.println(op + " Divisione");
                break;       
            default:
                System.out.println("Errore non conosco questo carattere");
                break;
        }
    }
}