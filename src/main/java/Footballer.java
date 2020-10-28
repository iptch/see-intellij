public class Footballer {

    private String lastname;
    private String firstname;
    private boolean isBlockedByLaw;
    private Integer age;
    private String healthyStatus; // might be HEALTHY_STATUS or NOT_HEALTHY_STATUS

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
        return !"HEALTHY_STATUS".equals(healthyStatus);
    }

    public String getFirstname() {
        return firstname;
    }

    public String getLastname() {
        return lastname;
    }
}
