#include <iostream>
#include <cmath>
using namespace std;

int main()
{
       
        double M,T,X; // original meal price , tip percentage , tax percentage
        
        cin >> M >> T >> X; // take input
        
        double tip = T/100 * M;
        double tax = X/100 * M;
        double total = M + tip + tax;
        int t = ceil(total);  // Round up value
        
        cout << "The final price of the meal is $ " << t << "." << endl;
}
