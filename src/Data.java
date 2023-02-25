import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.function.BiFunction;
import java.util.function.BinaryOperator;
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

  public static <T, E> E reduce(List<T> lst, BiFunction<T, E, E> bf, E seed, boolean newLine) {

    for (T pok : lst) {
      seed = bf.apply(pok, seed);
      if (newLine) {
        seed = (E) (seed + "\n");
      }
    }
    return seed;
  }

  public static <T, R> R reduce(List<T> lst, BiFunction<T, R, R> bf, R seed) {

    R prev = seed;
    for (T pok : lst) {
      prev = seed;
      seed = bf.apply(pok, seed);
      if (seed == null) {
        seed = prev;
      }
    }
    return seed;
  }

  public static <T> IPokemon findPokemon(List<IPokemon> lst, T val) {

    for (IPokemon poke : lst) {
      if (val.equals(poke.getHP())) {
        return poke;
      }
      if (val.equals(poke.getName())) {
        return poke;
      }
      if (val.equals(poke.getLegendary())) {
        return poke;
      }
    }
    return null;
  }
}