#include <iostream>

using namespace std;

int hourglass_sum(int arr[6][6], int i, int j)
{
    int sum;
    
    sum = arr[i][j] + arr[i][j+1] + arr[i][j+2] + arr[i+1][j+1]+
                  arr[i+2][j] + arr[i+2][j+1] + arr[i+2][j+2];
    
    return sum;
}

int main()
{
    int arr[6][6] = {};
    int maximum_hourglass;
    int sum;
    
    for(int i = 0; i < 6; i++)
    {
        for(int j = 0; j < 6; j++)
        {
            cin >> arr[i][j];
        }
    }
    
    for(int i = 0; i < 4; i++)
    {
        for(int j = 0; j < 4; j++)
        {
            sum = hourglass_sum(arr, i, j);
            if(i == 0 && j == 0)
            {
                maximum_hourglass = sum;
            } else if(sum > maximum_hourglass)
            {
                maximum_hourglass = sum;
            }
        }
    }
    cout << maximum_hourglass << endl;
}
