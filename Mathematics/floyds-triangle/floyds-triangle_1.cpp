#include <bits/stdc++.h>
using namespace std;

int main() {
    int n;
    cin >> n;
    int num = 1;

    // code here
    for (int i=1; i<=n; i++) {
        for (int j=1; j<=i; j++) {
            cout<<num++<<" ";
        }
        cout<<endl;
    }

    return 0;
}