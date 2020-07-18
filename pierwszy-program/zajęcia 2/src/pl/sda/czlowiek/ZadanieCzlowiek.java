package pl.sda.czlowiek;

public class ZadanieCzlowiek {
   private final long id;
   private String name;
   private String surname;
   private String personal;

    public String (long id) {
        this.id = id;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getPersonal() {
        return personal;
    }

    public void setPersonal(String personal) {
        this.personal = personal;
    }

    @Override
    public String toString() {
        return "pl.sda.czlowiek.ZadanieCzlowiek{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", personal='" + personal + '\'' +
                '}';
    }

    public long getId() {
        return id;


    }
}
