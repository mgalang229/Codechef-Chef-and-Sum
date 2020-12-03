#include <bits/stdc++.h>
#include <ext/pb_ds/assoc_container.hpp>
using namespace std;
using namespace __gnu_pbds;

#define ll long long
#define ar array

typedef tree<int, null_type, less<int>, rb_tree_tag,
tree_order_statistics_node_update> indexed_set;

void solve() {
	int n, k;
	cin >> n >> k;
	ll a[n];
	for(int i=0; i<n; ++i)
		cin >> a[i];
	sort(a, a+n);
	ll cnt=0, f=0, l=n-1;
	while(f<l) {
		if(a[f]+a[l]==k) {
			cnt=1;
			break;
		} else if(a[f]+a[l]>k)
			l--;
		else
			f++;
	}
	cout << (cnt!=0?"Yes":"No") << "\n";
}

int main() {
	ios::sync_with_stdio(0);
	cin.tie(0);
	
	int t;
	cin >> t;
	while(t--) 
		solve();
}
