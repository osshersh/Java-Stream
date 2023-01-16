package task4;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Doctors {
    public List getMedicalSpeciality(List<String> list) {
        return Arrays.stream(list.stream()
                        .map(element -> element.split(":"))
                        .flatMap(array -> Arrays.stream(array))
                        .filter(element -> !element.contains("Szpital") && !element.contains("Przychodnia"))
                        .distinct()
                        .collect(Collectors.joining(", "))
                        .split(" ,"))
                        .peek(ele -> System.out.print(ele))
                        .collect(Collectors.toList());
    }
}
