import java.util.*;
public class Solution{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long a[] = new long[n];
        long sum = 0,maxSum = 0;
        for(int i = 0; i < n; i++){
            a[i] = sc.nextInt();
            sum += a[i];
            maxSum += (i+1)*a[i];
        }
        long newSum = maxSum;
        for(int i = 0;i < n; i++){
            newSum = newSum - sum + n*a[i];
            if(newSum > maxSum)
                maxSum = newSum;
        }
        System.out.println(maxSum);
    }
}
