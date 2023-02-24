import java.io.IOException;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.function.Predicate;

public class Main {
  public static void main(String[] args) throws IOException {
    DataSet pokemon = new DataSet("src/Pokemon.csv", "src/cleansedData.csv");
    List<IPokemon> pokeList = pokemon.readFromFile();

    Poke p = new Poke(pokeList);

//     return fireLegendary;
//    pokemon.writeToFile(p.returnLegendaryFires());

//     return Pokemon starting with 'A' in ascending order


    // this works??

//    IPokemon startingPoke = pokeList.get(0);
//    String pokemonWithHighestAttackDMG = startingPoke.getName();
//    int highestAttack = startingPoke.getAttackDMG();
//
//    for (IPokemon pok : pokeList) {
//      String pokemonName = PokeBiFunction.highestAttackDamage.apply(pok, highestAttack);
//      if (pokemonName != null) {
//        pokemonWithHighestAttackDMG = pokemonName;
//        highestAttack = pok.getAttackDMG();
//      }
//    }
//    System.out.println(pokemonWithHighestAttackDMG);

//    pokemon.writeToFile(p.returnAllPokemonStartWithA());



    }
  }
