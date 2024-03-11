package Java_Advance.esHashSet;

import java.util.HashSet;

public class esHashSet1 {
    public static void main(String args[]) {
        HashSet<String> nomi = new HashSet<String>();
        riempiHashSet(nomi);
        for (String i : nomi){
            System.out.println(i);
        }
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