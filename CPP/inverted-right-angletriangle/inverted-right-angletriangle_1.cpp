#include <iostream>
using namespace std;

int main() {
    int n;
    cin >> n;

    // code here
    for (int i=0; i<n; i++) {
        for (int j=0; j<n-i; j++) {
            cout<<"*";
        }
        cout<<endl;
    }

    return 0;
}
