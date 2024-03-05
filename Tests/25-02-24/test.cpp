#include <bits/stdc++.h>
using namespace std;
int swapi(int a, int b)
{
    cout << "a :" << (char)a << " "
         << " b" << (char)b << endl;

    a = a ^ b;
    b = a ^ b;
    a = a ^ b;

    cout << "a :" << (char)a << " "
         << "b " << (char)b << endl;
}
int main()
{
    string a = "ABC";

    swapi((int)a[0], (int)a[1]);
    return 0;
}