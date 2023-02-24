import java.util.function.Predicate;

public class PokePredicates {

  static Predicate<IPokemon> nameLengthLowerThenFive = each -> each.getName().length() < 7;

  static Predicate<IPokemon> predicateFirePokemon = each -> each.getType1().toLowerCase().contains("fire");
  static Predicate<IPokemon> predicateWaterPokemon = each -> each.getType1().toLowerCase().contains("water");
  static Predicate<IPokemon> predicateGrassPokemon = each -> each.getType1().toLowerCase().contains("grass");
  static Predicate<IPokemon> predicateRockPokemon = each -> each.getType1().toLowerCase().contains("rock");
  static Predicate<IPokemon> predicateElectricPokemon = each -> each.getType1().toLowerCase().contains("electric");
  static Predicate<IPokemon> predicatePoisonPokemon = each -> each.getType1().toLowerCase().contains("poison");

  static Predicate<IPokemon> predicateLegendary = IPokemon::getLegendary;
//  static Predicate<IPokemon> predicateLegendary = each -> each.getLegendary();

  static Predicate<IPokemon> predicateGeneration = each -> Boolean.parseBoolean(each.getGeneration());

  static Predicate<IPokemon> predicateFireAndLegendary = each -> Boolean.parseBoolean(each.getGeneration().toLowerCase())
          && each.getType1().toLowerCase().contains("fire");

  static Predicate<IPokemon> predicatePokemonStartWithA = each -> each.getName().toLowerCase().startsWith("ab");

}
