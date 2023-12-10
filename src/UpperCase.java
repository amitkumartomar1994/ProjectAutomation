import org.testng.annotations.Test;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;


public class UpperCase {
    @Test
    void uppercase() {
        Stream.of("amit", "akansha", "milli", "pooja", "vandana").filter(s -> s.endsWith("a")).map(s -> s.toUpperCase())
                .forEach(s -> System.out.println(s));

    }

    @Test
    void lower() {
        Stream.of("amit", "akansha", "milli", "pooja", "vandana").filter(s -> s.startsWith("p")).map(s -> s.toUpperCase())
                .forEach(s -> System.out.println(s));
    }

    @Test
    void sorted() {
        List<String> names = Arrays.asList("amit", "akansha", "milli", "pooja", "vandana");
        names.stream().filter(s -> s.startsWith("a")).sorted().map(s -> s.toUpperCase()).forEach(s -> System.out.println(s));
    }



}



