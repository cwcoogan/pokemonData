import java.util.List;

public class PokemonData implements IPokemon{
  private String name;
  private int ID;
  private boolean legendary;
  private int attackSpeed;
  private int HP;
  private String generation;
  private String type1;
  private String type2;
  private int attackDMG;


  public PokemonData(List<String> pokemon) {
    this.name = pokemon.get(1);
    this.ID = Integer.parseInt(pokemon.get(0));
    this.legendary = Boolean.parseBoolean(pokemon.get(12).toLowerCase());
    this.attackSpeed = Integer.parseInt(pokemon.get(9));
    this.HP = Integer.parseInt(pokemon.get(5));
    this.generation = pokemon.get(12);
    this.type1 = pokemon.get(2);
    this.type2 = pokemon.get(3);
    this.attackDMG = Integer.parseInt(pokemon.get(8));
  }

  public String getName() {
    return name;
  }

  public int getID() {
    return ID;
  }

  @Override
  public boolean getLegendary() {
    return this.legendary;
  }

  @Override
  public int getAttackSpeed() {
    return this.attackSpeed;
  }

  @Override
  public int getHP() {
    return this.HP;
  }

  @Override
  public String getGeneration() {
    return this.generation;
  }

  @Override
  public String getType1() {
    return this.type1;
  }

  @Override
  public String getType2() {
    return this.type2;
  }

  @Override
  public int getAttackDMG() {
    return this.attackDMG;
  }

  @Override
  public String toString() {
    return "Name: " + name + "  Legendary: " + legendary
            + "  Attack Speed: " + attackSpeed + "  HP: " + HP + "  GEN: " + generation
            + "  TYPE: " + type1 + "  Attack DMG:" + attackDMG;
  }
}
