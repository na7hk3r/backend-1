package Ejercitacion1;

public class Persona {

    private String name;
    private String surname;
    private String email;
    private int age;

    // Constructor
    public Persona(String name, String surname, String email, int age) {
        this.name = name;
        this.surname = surname;
        this.email = email;
        this.age = age;
    }
    // Getters y Setters
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    // Metodos
    public boolean isAdult(){
        return this.age > 18;
    }

    public String fullName(){
        return this.surname + ", " + this.name;
    }
}