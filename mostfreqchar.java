import java.util.HashMap;

class Source {
  private static HashMap<Character,Integer> charCount(String s){
  HashMap<Character,Integer> count = new HashMap<Character,Integer>();
    for(char i : s.toCharArray()){
      if (count.get(i) == null){
        count.put(i,0);
      }
      count.put(i, count.get(i)+1);
    }
    return count;
  }
  public static char mostFrequentChar(String s) {
    HashMap<Character,Integer> count = charCount(s);
    char mostFreq = '\0';
    for (char i:s.toCharArray()){
      if (mostFreq == '\0' || count.get(i) > count.get(mostFreq)){
      mostFreq = i;
      }
    }
    return mostFreq;
  }

  public static void run() {
    // this function behaves as `main()` for the 'run' command
    // you may sandbox in this function , but should not remove it
  }
}
