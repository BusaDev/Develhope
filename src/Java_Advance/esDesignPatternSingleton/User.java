package Java_Advance.esDesignPatternSingleton;

public class User {
    private String name;
    private int eta;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getEta() {
        return eta;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", eta=" + eta +
                '}';
    }

    public void setEta(int eta) {
        this.eta = eta;
    }

    public void stampa(){
        System.out.println(name + " " + eta);
    }
}
