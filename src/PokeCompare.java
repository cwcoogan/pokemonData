import java.util.Comparator;

public class PokeCompare {

  public static Comparator<IPokemon> compareByNameLengthAscending() {
    return (first, second) -> {
      if (first.getName().length() > second.getName().length()) {
        return 1;
      }
      if (first.getName().length() < second.getName().length()) {
        return -1;
      }
      return 0;
    };
  }

  public static Comparator<IPokemon> compareByAttackSpeed() {
    return (first, second) -> {
      if (first.getAttackSpeed() > second.getAttackSpeed()) {
        return 1;
      }
      if (first.getAttackSpeed() < second.getAttackSpeed()) {
        return -1;
      }
      return 0;
    };
  }

  public static Comparator<IPokemon> compareByHP() {
    return (first, second) -> {
      if (first.getHP() > second.getHP()) {
        return -1;
      }
      if (first.getHP() < second.getHP()) {
        return 1;
      }
      return 0;
    };
  }

  public static Comparator<IPokemon> compareByAttackDMG() {
    return (first, second) -> {
      if (first.getAttackDMG() > second.getAttackDMG()) {
        return -1;
      }
      if (first.getAttackDMG() < second.getAttackDMG()) {
        return 1;
      }
      return 0;
    };
  }
}
