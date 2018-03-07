package javastudy;

import org.junit.Assert;
import org.junit.Test;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;


/**
 * @author agorelikova
 * @since 21/02/2018
 */
public class MapDogTest {

  final int index=10;

  private Map<Integer, String> source;

  public MapDogTest() {
    source = new HashMap<>();
    source.put(4, "Cc");
    source.put(2, "Aa");
    source.put(1, "Bb");
    source.put(3, "Dd");
  }

  @Test
  public void shouldSortCollectionByValueAsc() throws Exception {
    List<Map.Entry<Integer, String>> list = MapDog.sortByValue(source).collect(Collectors.toList());

    for(int i = 1; i < list.size() - 1; i++ ) {
      Assert.assertTrue(list.get(i-1).getValue() + " should be greater than " + list.get(i).getValue(),
        list.get(i-1).getValue().compareTo(list.get(i).getValue()) < 0
      );
    }
  }

  @Test
  public void shouldSortCollectionByKeyAsc() throws Exception {
    List<Map.Entry<Integer,String>> list = MapDog.sortByKey(source).collect(Collectors.toList());
    for (int i=1; i<list.size()-1; i++) {
      Assert.assertTrue(String.valueOf(list.get(i-1).getKey() + list.get(i).getKey()),
        list.get(i-1).getKey().compareTo(list.get(i).getKey())<0);
    }
  }

  @Test
  public void shouldPrintSortedCollectionChoiceVar() throws Exception {

  }



}