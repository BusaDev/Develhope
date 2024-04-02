package Java_Basic.esGetSet1;

public class Studenti {
    private String name;
    private String surname;
    private String birthYear;
    private int id;

    public Studenti(String name, String surname, String birthYear, int id) {
        this.name = name;
        this.surname = surname;
        this.birthYear = birthYear;
        this.id = id;
    }
    public String getName(){
        return name;
    }
    public String getSurname(){
        return surname;
    }
    public String getBirthYear(){
        return birthYear;
    }
    public int getId(){
        return id;
    }
    public void setName(String name){
        this.name = name;
    }
    public void setSurname(String surname){
        this.surname = surname;
    }
    public void setBirthYear(String birthYear){
        this.birthYear = birthYear;
    }
    public void setId(int id){
        this.id = id;
    }
}
