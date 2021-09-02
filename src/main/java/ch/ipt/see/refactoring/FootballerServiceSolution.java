package ch.ipt.see.refactoring;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class FootballerServiceSolution {

    public static final int AGE_REQUIREMENT = 18;
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
        return allFootballers.stream().filter(f -> isAdult(f)).collect(Collectors.toList());
    }

    // using extract method
    // using extract constant
    private boolean isAdult(Footballer f) {
        return f.getAge() >= AGE_REQUIREMENT;
    }

    public List<String> getNames() {

        // using extract variable
        List<Footballer> collect = allFootballers.stream()
                .filter(f -> isAdult(f))
                .collect(Collectors.toList());
        return collect
                .stream()
                .map(footballer -> formatName(footballer.getFirstname(), footballer.getLastname()))
                .collect(Collectors.toList());
    }
}
