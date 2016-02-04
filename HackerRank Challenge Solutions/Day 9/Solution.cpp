#include <cmath>
#include <cstdio>
#include <vector>
#include <iostream>
#include <algorithm>
using namespace std;
int find_gcd(int,int); // Function Prototype
int main() {
    int a,b;
    //Take input
    cin>>a>>b;
    int gcd=find_gcd(a,b); // Function Call
    cout<<gcd;
    return 0;   
}

int find_gcd(int a , int b) // Function Definition 
{
    if(a==b ||b==0){
        return a;
    }
    else
        return find_gcd(b,a%b);
}