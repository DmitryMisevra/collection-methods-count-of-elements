import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Integer[] numbers = {1, 2, 2, 3, 3, 3, 4, 4, 4, 4};
        Map<Object, Integer> counts = CountOfElementsMethod.countElements(numbers);
        System.out.println(counts);
    }
}
