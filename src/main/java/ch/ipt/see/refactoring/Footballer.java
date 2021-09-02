package ch.ipt.see.refactoring;

public class Footballer {

    // *----------------------------------------------------------------*
    // | All exercises have to be done using the shortcut on the        |
    // | IntelliJ cheat sheet (see generate code).                      |
    // *----------------------------------------------------------------*
    //
    // https://resources.jetbrains.com/storage/products/intellij-idea/docs/IntelliJIDEA_ReferenceCard.pdf
    //
    // 1. Generate Getters for the given attributes of this class.
    // 2. Generate Setters for the given attributes of this class.
    // 3. Generate two different constructors for this class.
    // 4. Generate the hashcode and the equals method for this class.
    // 5. Generate a unit test for this class and let it run.

    private String lastname;
    private String firstname;
    private boolean isBlockedByLaw;
    private Integer age;
    private String healthyStatus; // might be HEALTHY or NOT_HEALTHY

    public Footballer(String firstname, String lastname, int age) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public String getFirstname() {
        return firstname;
    }

    public String getLastname() {
        return lastname;
    }
}
