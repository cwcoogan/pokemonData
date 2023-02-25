import java.util.List;
import java.util.function.BiFunction;

public class PokeBiFunction {
  List<IPokemon> list;


  static BiFunction<IPokemon, Integer, String> highestAttackDamage = (each, acc) -> {
    if (each.getAttackDMG() > acc)
      return each.getName();
    return each.getName();
  };


  static BiFunction<IPokemon, Integer, Integer> totalHP = (each, acc) -> {
    System.out.println(acc);
    acc += each.getHP();
    {
    }
    return acc;
  };


  static BiFunction<IPokemon, String, String > allNames = (each, acc) -> {
    return acc += each.getName() + " ";
  };

  static BiFunction<IPokemon, Integer, Integer> returnHighestHPPokemon = (each, acc) -> {
    if (each.getHP() > acc){
      return each.getHP();
    }
    return null;
  };
}
