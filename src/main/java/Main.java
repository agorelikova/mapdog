import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

import static javastudy.MapDog.*;

public class Main {

  public static void main(String[] args) {

    Map<Integer, String> dogs = new HashMap<Integer, String>();
    dogs.put(12, "Терри");
    dogs.put(18, "Лисса");
    dogs.put(33, "Бекки");
    dogs.put(54, "Вальмонт");
    dogs.put(105, "Дани");
    dogs.put(81, "Дася");
    dogs.put(23, "Чиполлет");
    dogs.put(1, "Тузик");


    Scanner ans = new Scanner(System.in);
    String x;

    while (true) {
      printHelp();
      x = ans.nextLine();
      switch (x) {
        case "1":
          print(sortByKey(dogs));
          break;
        case "2":
          print(sortByValue(dogs));
          break;
        case "exit":
        case "end":
        case "^c":
          System.exit(0);
        default:
          System.out.println("Неверный символ");

      }
    }
  }
}
