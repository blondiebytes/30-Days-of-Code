#include <iostream>
#include <cmath>
using namespace std;

int main()
{
        int testCaseNum;
        cin >> testCaseNum;
        
          for (int i = 0; i < testCaseNum; i++) {
             int a,b,n;
             cin >> a >> b >> n;
             int num = a;
              for (int j = 0; j < n; j++) {
                  num += b*pow(2, j);
                  cout << num << " ";
              }
              cout << endl;
          }
   
   return 0;
}

