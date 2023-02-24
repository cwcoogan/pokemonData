import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class DataSet {
    File inputFile;
    File outputFile;

    public DataSet(String inputFile, String outputFile) throws IOException {
      this.inputFile = new File(inputFile);
      this.outputFile = new File(outputFile);
    }

    public List<IPokemon> readFromFile() throws IOException {
      List<IPokemon> cleansedData = new ArrayList<>();
      Scanner bufferedReader = new Scanner(inputFile);

      bufferedReader.nextLine();
      while (bufferedReader.hasNextLine()) {
        cleansedData.add(new PokemonData(List.of(bufferedReader.nextLine().split(","))));
      }

      return cleansedData;
    }

  public void writeToFile(List<IPokemon> pokemon) throws IOException {
    FileWriter writer = new FileWriter(outputFile);

    for (IPokemon each : pokemon) {
      writer.write(String.valueOf(each) + ("\n"));
    }
    writer.flush();
    writer.close();
  }
}
