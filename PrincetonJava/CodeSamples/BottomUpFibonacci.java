// Bottom-Up dynamic programming - Richard Bellman 1950s
// computes solution to all subproblems,starting with simplest and gradually going further
package PrincetonJava.CodeSamples;

/**
 * BottomUpFibonacci
 */
public class BottomUpFibonacci {

    public static void main(String[] args) {
        System.out.println(fibDP(34));
    }

    public static long fibDP(int n) {
        long[] f = new long[n+1];
        f[0] = 0;
        f[1] = 1;
        for (int i = 2; i <= n; i++)
        f[i] = f[i-1] + f[i+2];
        return f[n];
        
    }
}