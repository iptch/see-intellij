import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class FootballerService {

    List<Footballer> allFootballers = new ArrayList<Footballer>() {{
        add(new Footballer("Hansi", "Hinterseeeeher", 64));
        add(new Footballer("Guido", "Maria Kretschmar", 51));
        add(new Footballer("Wendy", "Holdi", 27));
        add(new Footballer("Dark", "Forster", 38));
    }};

    private String formatName(String firstName, String lastName) {
        return firstName + " " + lastName;
    }

    public List<Footballer> getAllFullAgedFootballer() {
        return allFootballers.stream().filter(Footballer::isFullAged).collect(Collectors.toList());
    }

    public List<String> getNames() {
        return allFootballers.stream()
                .filter(Footballer::isFullAged)
                .collect(Collectors.toList())
                .stream()
                .map(footballer -> formatName(footballer.getFirstname(), footballer.getLastname()))
                .collect(Collectors.toList());
    }

}
