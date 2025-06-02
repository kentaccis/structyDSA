import java.util.List;
import java.util.ArrayList;

class Source {
  public static List<List<String>> pairs(List<String> elements) {
    List<List<String>> result = new ArrayList<>();

    for (int i = 0; i <elements.size(); i++){
      for (int j = i+1; j <elements.size(); j++){
        List<String> pair = List.of(elements.get(i), elements.get(j));
        result.add(pair);
      }
    }
    return result;
  }

  public static void run() {
    // this function behaves as `main()` for the 'run' command
    // you may sandbox in this function , but should not remove it
  }
}
