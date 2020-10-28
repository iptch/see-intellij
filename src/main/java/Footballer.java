public class Footballer {

    public static final String HEALTHY = "HEALTHY";
    private String firstname;
    private String lastname;
    private boolean isBlockedByLaw;
    private Integer age;
    private String healthyStatus; // might be HEALTHY or NOT_HEALTHY

    public Footballer(String firstname, String lastname, Integer age) {
        this.firstname = firstname;
        this.lastname = lastname;
        age = age;
    }

    public boolean canPlay() {
        return getHealthyStatus().equals(HEALTHY) && !isBlockedByLaw();
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
        return !HEALTHY.equals(healthyStatus);
    }

    public String getFirstname() {
        return firstname;
    }

    public String getLastname() {
        return lastname;
    }

    boolean isFullAged() {
        return isOlderThan(18);
    }

    private boolean isOlderThan(int age) {
        return getAge() >= age;
    }
}
