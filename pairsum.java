import java.util.List;
import java.util.HashMap;

class Source {
  public static List<Integer> pairSum(List<Integer> numbers, int target) {
    HashMap<Integer, Integer> previousNums = new HashMap<>();
    for (int i=0; i<numbers.size();i++){
      int nums = numbers.get(i);
      int compliment = target - nums;
      if (previousNums.containsKey(compliment)){
        return List.of(previousNums.get(compliment), i);
      }
      previousNums.put(nums,i);
    }
    return null;
  }

  public static void run() {
    // this function behaves as `main()` for the 'run' command
    // you may sandbox in this function , but should not remove it
  }
}
