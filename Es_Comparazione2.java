public class Es_Comparazione2 {
    public static void main(String args[]) {
        char firstChar = 'a';
        char secondChar = 'a';
        System.out.println("il primo carattere è " + firstChar + " il secondo carattere è " + secondChar + equal(firstChar, secondChar));

    }
    public static String equal (char firstChar, char secondChar){
        if (firstChar == secondChar){
            String result = " I due caratteri sono uguali";
            return result;
        }else{
            String result = " I due caratteri sono diversi";
            return result;
        }       
    }
}