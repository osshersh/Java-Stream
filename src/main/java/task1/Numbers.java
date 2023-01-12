package task1;

import java.util.List;
import java.util.stream.IntStream;

public class Numbers {
    public List getListNumbersDivideThree(int start, int end) {
        IntStream intStream = IntStream.range(start, end);
        return intStream.filter(number -> number % 3 == 0).peek(element -> System.out.println(element)).boxed().toList();
    }
}
