#include<iostream>
#include<math.h>
using namespace std;

int main(){
	int testCaseNum, a, b, num, n;
  	cin>>testCaseNum;
  	for (int i = 0; i < testCaseNum; i++) {
    	cin>>a>>b>>n;
		num=a;
        for (int j = 0; j < n; j++) {
        	num += b*pow(2, j);
            cout<<num<<" ";
        }
        cout<<endl;
    }
    return 0;
}
