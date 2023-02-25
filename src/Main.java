import java.io.IOException;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.Predicate;

public class Main {
  public static void main(String[] args) throws IOException {
    DataSet pokemon = new DataSet("src/Pokemon.csv", "src/cleansedData.csv");
    List<IPokemon> pokeList = pokemon.readFromFile();

    Poke p = new Poke(pokeList);

//     return fireLegendary;
//    pokemon.writeToFile(Poke.sortAndFilter(pokeList, PokePredicates.predicateLegendary, PokeCompare.compareByNameLengthAscending()));
//    pokemon.writeToFile(Poke.reduce(pokeList, PokeBiFunction.allNames, "", true));
//    pokemon.writeToFile(Data.findPokemon(pokeList, Poke.reduce(pokeList, PokeBiFunction.returnHighestHPPokemon, 0)).getName());


    pokemon.writeToFile(Data.bubbleSort(pokeList, PokeCompare.compareByHP()));
//    pokemon.writeToFile(p.returnLegendaryFires());

//     return Pokemon starting with 'A' in ascending order
//    pokemon.writeToFile(p.returnAllPokemonStartWithA());


    // this works??

//    IPokemon startingPoke = pokeList.get(0);
//    String pokemonWithHighestAttackDMG = startingPoke.getName();
//    int highestAttack = startingPoke.getAttackDMG();

//    for (IPokemon pok : pokeList) {
//      String pokemonName = PokeBiFunction.highestAttackDamage.apply(pok, highestAttack);
//      if (pokemonName != null) {
//        pokemonWithHighestAttackDMG = pokemonName;
//        highestAttack = pok.getAttackDMG();
//      }
//    }
//    System.out.println(pokemonWithHighestAttackDMG);
//  }
//    pokemon.writeToFile(p.returnAllPokemonStartWithA());
//
//    IPokemon start = pokeList.get(0);
//    int acc = start.getHP();

//    Integer acc = 0;
//    for (IPokemon pok : pokeList) {
//      acc = PokeBiFunction.totalHP.apply(pok, acc);
//    }
//    System.out.println(acc);
//    }

//    String acc = " ";
//    for (IPokemon pok : pokeList) {
//      acc = PokeBiFunction.allNames.apply(pok, acc);
//    }
//    System.out.println(acc);
//  }

//    pokemon.writeToFile(p.returnConcatPokemon());

//     return highest HP Pokemon
//    IPokemon startingPokemon = pokeList.get(0);
//    String pokemonNameWithHighestHP = startingPokemon.getName();
//    int highestHP = startingPokemon.getHP();
//
//    for (IPokemon poke : pokeList) {
////      String pokeName = PokeBiFunction.returnHighestHPPokemon.apply(poke, highestHP);
//      if (poke.getName() != null) {
//        pokemonNameWithHighestHP = poke.getName();
//        highestHP = poke.getHP();
//      }
//    }
//    System.out.println(pokemonNameWithHighestHP);
//  }


  }
  }


