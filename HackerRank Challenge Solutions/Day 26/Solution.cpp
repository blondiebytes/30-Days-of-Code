#include <cmath>
#include <cstdio>
#include <vector>
#include <iostream>
#include <algorithm>
using namespace std;


int main() {
 
    int monthly_fine=15;
    int same_year_fine=500;
    int next_year_fine=10000;
    int res;
    int actual_date,actual_month,actual_year;
    int exp_date,exp_month,exp_year;
    int date_diff,month_diff,year_diff;
    
    cin>>actual_date>>actual_month>>actual_year;
    cin>>exp_date>>exp_month>>exp_year;
    
    date_diff= actual_date-exp_date;
    month_diff= actual_month-exp_month;
    year_diff= actual_year-exp_year;
    
   
    
    if(date_diff>0 && month_diff==0){
        res= monthly_fine * date_diff;
        cout<<res<<endl;
    }else if(month_diff>0 && year_diff==0){
        res= same_year_fine * month_diff;
        cout<<res<<endl;
    }else if(year_diff>0){
        res=next_year_fine * year_diff;
        cout<<res<<endl;
    }else{
        res=0;
        cout<<res<<endl;
    }
    
    return 0;
}
