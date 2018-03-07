package javastudy;

import java.util.Map;
import java.util.logging.Logger;
import java.util.stream.Stream;

/**
 * @author agorelikova
 * @since 21/02/2018
 */
public class MapDog {

  private static final Logger log = Logger.getLogger(MapDog.class.getName());

  public static void printHelp() {
    log.info("Введите 1 для сортировки map по ключу, 2 - для сортировки по значению, or exit for close");
  }

  public static Stream<Map.Entry<Integer, String>> sortByValue(Map<Integer, String> input) {
    return input.entrySet().stream()
      .sorted((t1, t2) -> t1.getValue().compareTo(t2.getValue()));
  }

  public static Stream<Map.Entry<Integer, String>> sortByKey(Map<Integer, String> input) {
    return input.entrySet().stream()
      .sorted((t1, t2) -> t1.getKey().compareTo(t2.getKey()));
  }

  public static void print(Stream<Map.Entry<Integer, String>> inputStream) {
    log.info("Сортировка по значению");
    inputStream.map(Map.Entry::toString)
      .forEach(log::info);
  }
}
