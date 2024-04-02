package Java_Advance.esDesignPatternSingleton;

public class Main {

    public static User user;
    public static User getUser(){
        if (user == null){
            user = new User();
        }
        return user;
    }
    public static void main(String args[]){
        User user1 = getUser();
        System.out.println(user1);
        User user2 = getUser();
        user2.setEta(29);
        user2.setName("Davide");
        System.out.println(user2);
    }

}
