import java.util.HashMap;
import java.util.Map;

public class CountOfElementsMethod {

    public static HashMap<Object, Integer> countElements(Object[] elements) {
        HashMap<Object, Integer> counts = new HashMap<>();
        for (Object element : elements) {
            counts.put(element, counts.getOrDefault(element, 0) + 1);
        }
        return counts;
    }
}
