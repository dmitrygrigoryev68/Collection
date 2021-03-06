import java.util.List;
import java.util.stream.Collectors;

public class SumOfList<T extends Number> {
    public Double sumOfList(List<T> list) {
        return list
                .stream()
                .collect(Collectors
                        .summingDouble(n -> Double.valueOf(n.toString())));

    }
}
