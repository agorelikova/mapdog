package javastudy;

import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/**
 * @author agorelikova
 * @since 21/02/2018
 */
public class MapdogTest {

  //private Mapdog mapdog;
  private Map<Integer, String> m;
  private Map<Integer, String> ex;

  public MapdogTest() {
    m = new HashMap<Integer, String>();
    m.put(4, "Cc");
    m.put(2, "Aa");
    m.put(1, "Bb");
    m.put(3, "Dd");


    ex.put(2, "Aa");
    ex.put(1, "Bb");
    ex.put(4, "Cc");
    ex.put(3, "Dd");
  }


  @Test
  public void testSortedByValue() throws Exception {

    for (Map.Entry<Integer, String> entry : m.entrySet()) {
      System.out.println("TestMapgit config user.name agorelikovaping " + entry.getValue());
    }



     m.entrySet().stream().sorted((t1, t2) -> t1.getValue().compareTo(t2.getValue()));

  }

  @Test
  public void testSortedByKey() throws Exception {

    m.entrySet().stream().sorted((t1, t2) -> t1.getKey().compareTo(t2.getKey()));

  }



}