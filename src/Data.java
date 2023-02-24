import java.util.Comparator;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public abstract class Data {

  public static <T> List<T> sortList(List<T> lst, Comparator<T> c) {
    return lst.stream()
            .sorted(c)
            .collect(Collectors.toList());
  }

  public static <T> List<T> sortAndFilter(List<T> lst, Predicate<T> pq, Comparator<T> c) {
    return lst.stream()
            .filter(pq)
            .sorted(c)
            .collect(Collectors.toList());
  }
}