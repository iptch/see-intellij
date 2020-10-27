import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class FootballerService {

    List<Footballer> allFootballers = new ArrayList<>();

    private String formatName(String firstName, String lastName) {
        return firstName + " " + lastName;
    }

    public List<Footballer> getAllNotFullAgedFootballer() {
        return allFootballers.stream().filter(f -> f.getAge() >= 18).collect(Collectors.toList());
    }
}
