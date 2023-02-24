import java.util.Comparator;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Poke extends Data{
  private List<IPokemon> list;


  public Poke(List<IPokemon> pokeList) {
    this.list = pokeList;

  }

  public List<IPokemon> returnLegendaryFires() {

     return this.list.stream()
            .filter(PokePredicates.predicateLegendary)
            .filter(PokePredicates.nameLengthLowerThenFive)
            .filter(PokePredicates.predicateElectricPokemon)
            .sorted(PokeCompare.compareByAttackSpeed())
            .collect(Collectors.toList());
    }

    public List<IPokemon> returnAllPokemonStartWithA() {

    return this.list.stream()
            .filter(PokePredicates.predicatePokemonStartWithA)
            .sorted(PokeCompare.compareByNameLengthAscending())
            .collect(Collectors.toList());
    }

    public List<IPokemon> returnHighestAttackDMGPokemon() {

      return this.list.stream()
              .filter(PokeBiFunction.highestAttackDamage);

    }


  }
