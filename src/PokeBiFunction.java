import java.util.List;
import java.util.function.BiFunction;

public class PokeBiFunction {
  List<IPokemon> list;


  static BiFunction<IPokemon, Integer, String> highestAttackDamage = (each, acc) -> {
    IPokemon startingPoke = pokeList.get(0);
    String pokemonWithHighestAttackDMG = startingPoke.getName();
    int highestAttack = startingPoke.getAttackDMG();

    for (IPokemon pok : pokeList) {
      String pokemonName = PokeBiFunction.highestAttackDamage.apply(pok, highestAttack);
      if (pokemonName != null) {
        pokemonWithHighestAttackDMG = pokemonName;
        highestAttack = pok.getAttackDMG();
      }
    }

    if (each.getAttackDMG() > acc)



      return each.getName();
    return each.getName();
  };
}




