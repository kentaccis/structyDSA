import java.util.HashMap;
class Source {
  public static HashMap<Character, Integer> charCount(String s){
  HashMap<Character, Integer> Count = new HashMap<Character, Integer>();
    for (char c : s.toCharArray()){
      if (Count.get(c) == null){
        Count.put(c, 0);
      }
      int current = Count.get(c);
      Count.put(c, current+1);
    }
    return Count;
    
    
  }
  public static boolean anagrams(String s1, String s2) {
    return charCount(s1).equals(charCount(s2));
    
  }

  public static void run() {
    // this function behaves as `main()` for the 'run' command
    // you may sandbox in this function , but should not remove it
  }
}
