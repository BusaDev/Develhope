package Java_Advance.esHashSet;

import java.util.HashSet;

public class esHashSet3 {
    public static void main(String args[]) {
        HashSet<String> nomi = new HashSet<String>();
        String nome = "Francesco";
        riempiHashSet(nomi);
        System.out.println(nomi);
        for (String i : nomi){
            if (i.equals(nome)){
                System.out.println("il nome "+ nome +" è presente nella collezione ed è stato eliminato");
            }
        }
        nomi.remove(nome);
        System.out.println(nomi);
        nomi.clear();
        System.out.println("Hashset svuotato");
        System.out.println(nomi);

    }
    static HashSet<String> riempiHashSet (HashSet<String> nomi){
        nomi.add("Davide");
        nomi.add("Daniele");
        nomi.add("Francesco");
        nomi.add("Julia");
        return nomi;
    }
}