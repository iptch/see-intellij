public class Footballer {

    private String firstname;
    private String lastname;
    private boolean isBlockedByLaw;
    private int age;
    private String healthyStatus; // might be HEALTHY_STATUS or NOT_HEALTHY_STATUS

    public Footballer(String firstname, String lastname) {
        this.firstname = firstname;
        this.lastname = lastname;
    }

    public boolean isBlockedByLaw() {
        return isBlockedByLaw;
    }

    public int getAge() {
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
