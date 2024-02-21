public class Es_IfStat {
    public static void main(String args[]) {
        String name = "Davide";
        length(name);
    }
    public static void length (String name){
        if(name.length() > 10){
            System.out.println("la stringa " + name + " è lunga " + name.length() + ", è maggiore di 10.");
        }else if(name.length() < 10){
            System.out.println("la stringa " + name + " è lunga " + name.length() + ", è minore di 10.");
        }else{
            System.out.println("la stringa " + name + " è lunga " + name.length() + ", è uguale di 10.");
        }
    }
}