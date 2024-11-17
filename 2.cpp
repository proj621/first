#include<iostream>
using namespace std;

float simpleIntereset(float principal, float time, float rate=5.0){
    return (principal*time*rate)/100;
}

int main(){
    float principal, time , rate;
    char choice;
    cout<<"Enter the principal amount: ";
    cin>>principal;
    cout<<"Enter the time period(in years): ";
    cin>>time;
    cout<<"Do you want to enter your rate of intereset(Y/N): ";
    cin>>choice;
    if(choice=='y' || choice=='Y'){
        cout<<"Enter the rate of intereset: ";
        cin>>rate;
        cout<<"Simple Intereset: "<<simpleIntereset(principal,time,rate)<<endl;
    }else{
        cout<<"Simple Intereset: "<<simpleIntereset(principal,time)<<endl;
    }

    return 0;
}
