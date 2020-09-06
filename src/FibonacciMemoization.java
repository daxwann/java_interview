import java.util.Arrays;

public class FibonacciMemoization {
  public static void main(String[] args) {
    printFibonacci(5);
  }

  public static void printFibonacci(int n) {
    if (n < 0) {
      System.out.println("n has to be 0 or greater");
    }

    int[] memo = new int[n + 1];
    Arrays.fill(memo, -1);

    findFibonacci(n, memo);
    for (int j : memo) {
      System.out.println(j);
    }
  }

  public static int findFibonacci(int n, int[] memo) {
    if (n < 2) {
      memo[n] = n;
      return n;
    }

    if (memo[n] != -1) {
      return memo[n];
    }

    int fibo = findFibonacci(n - 1, memo) + findFibonacci(n - 2, memo);
    memo[n] = fibo;
    return fibo;
  }
}
