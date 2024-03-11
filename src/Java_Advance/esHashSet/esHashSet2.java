package Java_Advance.esHashSet;

import java.util.HashSet;

public class esHashSet2 {
    public static void main(String args[]) {
        HashSet<String> nomi = new HashSet<String>();
        String nome = "Francesco";
        riempiHashSet(nomi);
        if(nomi.contains(nome)){
            System.out.println("nella collezione è presente il nome " + nome);
        }
        System.out.println(nomi);
        System.out.println(nomi.size());
    }
    static HashSet<String> riempiHashSet (HashSet<String> nomi){
        nomi.add("Davide");
        nomi.add("Daniele");
        nomi.add("Francesco");
        nomi.add("Julia");
        return nomi;
    }
}