public class StringPermutation {
  public static void main(String[] args) {
    long count = permutation("hel");
    System.out.println("count = " + count);
  }

  public static long permutation(String str) {
    return permutation(str, "");
  }

  public static long permutation(String str, String prefix) {
    long count = 0;

    if (str.length() == 0) {
      System.out.println("permutation " + prefix);
      return 1;
    } else {
      for (int i = 0; i < str.length(); i++) {
        String rem = str.substring(0, i) + str.substring(i + 1);
        count += permutation(rem, prefix + str.charAt(i));
      }
    }

    return count;
  }
}
