package task5;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Words {

    public List getUniqueLettersToUppercase(List<String> words) {
        return words.stream()
                .distinct()
                .map(element -> element.split(""))
                .flatMap(Arrays::stream)
                .map(String::toUpperCase)
                .distinct()
                .peek(System.out::print)
                .collect(Collectors.toList());
    }
}
