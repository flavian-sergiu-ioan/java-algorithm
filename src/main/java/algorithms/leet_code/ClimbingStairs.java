package algorithms.leet_code;

public class ClimbingStairs {

    public static void main(String[] args) {
        System.out.println(climbStairs(2));
        System.out.println(climbStairs(3));
        System.out.println(climbStairs(5));
    }

    /*public static int climbStairs(int n) {
        if(n==1) {
            return n;
        }
        int [] dp = new int [n+1];
        dp[1] = 1;
        dp[2] = 2;
        for (int i = 3; i <=n; i++) {
            dp[i] = dp[i -1] + dp[i -2];
        }
        return dp[n];
    }*/

    public static int climbStairs(int n) {
        if (n == 1) {
            return n;
        }
        int oneStep = 1;
        int twoStep = 2;
        for (int i = 3; i <=n ; i++) {
            int temp = twoStep;
            twoStep = oneStep + twoStep;
            oneStep = temp;
        }
        return twoStep;
    }

}
