#include <bits/stdc++.h>
using namespace std;
int main()
{
	int t;
	int *a;
	cin >> t;
	while(t--)
	{
		int n,c,b;
		cin >> n >> c >> b;
		a = (int *)malloc(n*sizeof(int ));
		memset(a, 0, sizeof(a));
		for(int i = 0; i < n; i++)
			a[i] = (n - (i + 1))*c + b*i;
		sort(a, a + n);
		printf("%d ", a[0]);
		for(int i = 1; i < n; i++)
			if(a[i] != a[i-1])
				printf("%d ", a[i]);
       		printf("\n");
 		}
	return 0;
}
