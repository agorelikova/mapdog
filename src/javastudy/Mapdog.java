package javastudy;

import java.util.Map;

/**
 * @author agorelikova
 * @since 21/02/2018
 */
public class Mapdog {

  public static void printHelp() {
    System.out.println("Введите 1 для сортировки map по ключу, 2 - для сортировки по значению, or exit for close");
  }

  public static void printSorterByValue(Map<Integer, String> d) {
    System.out.println("Сортировка по значению");
    d.entrySet().stream()
      .sorted((t1, t2) -> t1.getValue().compareTo(t2.getValue()))
      .forEach(System.out::println);
  }

  public static void printSortedByKey(Map<Integer, String> d) {
    System.out.println("Сортировка по ключу");
    d.entrySet().stream()
      .sorted((t1, t2) -> t1.getKey().compareTo(t2.getKey()))
      .forEach(System.out::println);
  }



}
