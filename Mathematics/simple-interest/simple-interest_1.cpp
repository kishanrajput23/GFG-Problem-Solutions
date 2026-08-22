#include <iostream>
using namespace std;

int main() {
    int p, r, t;
    cin >> p >> r >> t;

    // code here
    double ans = (p * r * t) / 100.0;
    
    cout << fixed << setprecision(2) << ans;

    return 0;
}