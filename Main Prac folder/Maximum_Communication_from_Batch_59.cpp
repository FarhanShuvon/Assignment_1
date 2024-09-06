#include <bits/stdc++.h>
using namespace std;
#define int long long
int32_t main()
{
    int n, e;
    cin >> n >> e;
    int t;
    cin >> t;
    map<int, int> m;
    for (int i = 0; i < t; i++)
    {
        int a, b;
        cin >> a >> b;
        m.insert(make_pair(a, b));
    }
    cout<<m.size()<<endl;
}
