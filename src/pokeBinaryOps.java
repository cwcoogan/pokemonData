import java.util.function.BinaryOperator;

public class pokeBinaryOps {

  static BinaryOperator<Integer> addAllAccumulator = (acc, value) ->
          acc += value;

  static BinaryOperator<Double> maxAccumulator = (acc, value) -> acc > value ? acc : value;

//  static BinaryOperator<IPokemon> getsName = (acc, value) ->
//          acc.getName() > value.getName();

}
