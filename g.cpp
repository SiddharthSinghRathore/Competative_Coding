// C++ program for the above approach
#include <bits/stdc++.h>
using namespace std;

// Max Element of the Array
const int maxn = 1000000;

void sumGreater(int ar[], int N)
{
	int i=0,j=0;
	for (i = 0; i < N; i++) {
		int cur_sum = 0;

		for (j = i - 1; j >= 0; j--) {

			if (ar[j] > ar[i])
				cur_sum += ar[j];
		}

		cout << cur_sum << " ";
	}
}

int main()
{
	// Given array arr[]
	int ar[] = { 7, 3, 6, 2, 1 };

	// Size of the array
	int N = sizeof ar / sizeof ar[0];

	// Function call
	sumGreater(ar, N);
	return 0;
}

