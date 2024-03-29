package ch.ipt.see.testing;

public class Footballer {

    private String lastname;
    private String firstname;
    private boolean isBlockedByLaw;
    private Integer age;
    private String healthyStatus; // might be HEALTHY or NOT_HEALTHY

    public Footballer(String firstname, String lastname, Integer age) {
        this.firstname = firstname;
        this.lastname = lastname;
        age = age;
    }

    public boolean isBlockedByLaw() {
        return isBlockedByLaw;
    }

    public Integer getAge() {
        return age;
    }

    public String getHealthyStatus() {
        return healthyStatus;
    }

    public boolean isInjured() {
        return !"HEALTHY".equals(healthyStatus);
    }

    public String getFirstname() {
        return firstname;
    }

    public String getLastname() {
        return lastname;
    }
}
