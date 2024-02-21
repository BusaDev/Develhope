public class Es_Fun2 {
    public static void main(String args[]) {
        String name = "Davide";
        System.out.println("la stringa " + name + " è lunga " + length(name) + " caratteri");
    }
    public static int length (String name){
        int stringLength = name.length();
        return stringLength;
    }
}