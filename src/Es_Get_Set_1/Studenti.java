package Es_Get_Set_1;

public class Studenti {
    String name;
    String surname;
    String birthYear;
    int id;

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
}
