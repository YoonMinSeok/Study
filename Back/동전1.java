import java.util.*;

public class Main{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        int k = sc.nextInt();
        
        int dp[] = new int[k+1];
        dp[0] = 1;
        
        for(int i= 0; i < n; i++){
            int a = sc.nextInt();
            for(int j= a; j <= k; j++){
                dp[j] += dp[j-a];
            }
        }
        System.out.println(dp[k]);
    }
}
