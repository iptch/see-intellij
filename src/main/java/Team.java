import java.util.List;

public class Team {

    private List<Footballer> fotballers;
    private String coach;

    public Team(String coach) {
        this.coach = coach;
    }

    public Team(List<Footballer> fotballers, String coach) {
        this.fotballers = fotballers;
        this.coach = coach;
    }

    public List<Footballer> getFotballers() {
        return fotballers;
    }

    public void setFotballers(List<Footballer> fotballers) {
        this.fotballers = fotballers;
    }

    public String getCoach() {
        return coach;
    }

    public void setCoach(String coach) {
        this.coach = coach;
    }
}
