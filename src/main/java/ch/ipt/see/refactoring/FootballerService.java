package ch.ipt.see.refactoring;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class FootballerService {

    // *----------------------------------------------------------------*
    // | All exercises have to be done using the shortcut on the        |
    // | IntelliJ cheat sheet (see generate code).                      |
    // *----------------------------------------------------------------*
    //
    // https://resources.jetbrains.com/storage/products/intellij-idea/docs/IntelliJIDEA_ReferenceCard.pdf
    //
    // 1. Rename this file to another name.
    // 2. Extract a variable.
    // 3. Extract at least one parameter from a method in this class.
    // 4. Extract a field.
    // 5. Extract a method.
    // 6. Extract a constant.

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
        return allFootballers.stream().filter(f -> f.getAge() >= 18).collect(Collectors.toList());
    }

    public List<String> getNames() {

        return allFootballers.stream()
                .filter(f -> f.getAge() >= 18)
                .collect(Collectors.toList())
                .stream()
                .map(footballer -> formatName(footballer.getFirstname(), footballer.getLastname()))
                .collect(Collectors.toList());
    }

    public Double calculateAverageAge(List<Footballer> footballers) {
        return footballers
                .stream()
                .mapToDouble(Footballer::getAge)
                .average()
                .orElse(Double.NaN);
    }

}
