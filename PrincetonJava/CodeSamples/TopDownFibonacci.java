// Top-Down = memoization
// Cache (store) values of each subproblem.
// Uses a static variable (class/global variable)
// Uses an array of longs

package PrincetonJava.CodeSamples;

/**
 * TopDownFibonacci
 */
public class TopDownFibonacci {

    public static void main(String[] args) {
        System.out.println(fibMemo(80));
    }

    static long[] memo = new long[100];

    public static long fibMemo(int n){
        if (n==0) return 0;
        if (n==1) return 1;
        if (memo[n] == 0)
            memo[n] = fibMemo(n-1) + fibMemo(n-2);
        return memo[n];
    }
}