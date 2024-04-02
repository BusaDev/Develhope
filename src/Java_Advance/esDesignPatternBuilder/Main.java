package Java_Advance.esDesignPatternBuilder;

public class Main {
    public static void main(String args[]){
        PersonBuilder personBuilder1 = new PersonBuilder();
        personBuilder1.setFirstName("Davide");
        personBuilder1.setLastName("Busa");
        personBuilder1.setAge(29);
        personBuilder1.setAddress("Via delle vie");
        Person person1 = personBuilder1.build();
        System.out.println(person1);

        PersonBuilder personBuilder2 = new PersonBuilder();
        personBuilder2.setFirstName("Julia");
        personBuilder2.setLastName("Munzone");
        Person person2 = personBuilder2.build();
        System.out.println(person2);
    }
}
