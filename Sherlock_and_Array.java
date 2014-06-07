import java.util.Scanner;

public class Solution {
	public static void main(String[] args) {
		int t;
		int a[];
		Scanner sc = new Scanner(System.in);
		t = sc.nextInt();
		while (t > 0) {
			int leftSum = 0, rightSum = 0, flag = 0;
			int n = sc.nextInt();
			a = new int[n];
			for (int i = 0; i < n; i++) {
				a[i] = sc.nextInt();
				rightSum += a[i];
			}
            rightSum -= a[0];
			for(int j = 0; j < n-1; j++){
				if(rightSum != leftSum){
					leftSum += a[j];
					rightSum -= a[j + 1];
				}
				else{
					flag = 1;
					break;
				}
			}
			if(flag == 1 || n == 1)
			System.out.println("YES");
			else
				System.out.println("NO");
            t--;
		}
	}

}
