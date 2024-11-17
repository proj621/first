#include<iostream>
using namespace std;

class Base{
public:
    Base(){
        cout<<"Base constructor"<<endl;
    }
    void displayBase(){
        cout<<"This is the BaseClass."<<endl;
    }
};

class Derived1 : public Base{
public:
    Derived1(){
        cout<<"Derived1 constructor"<<endl;
    }
    
    void displayDerived1(){
        cout<<"This is the DerivedClass1, inherited from Base."<<endl;
    }
};

class Derived2 : public Derived1{
public:
    Derived2(){
        cout<<"Derived2 constructor"<<endl;
    }
    
    void displayDerived2(){
        cout<<"This is the DerivedClass2, inherited from Derived1."<<endl;
    }
};

int main(){
    
    Derived2 obj;
    obj.displayBase();    
    obj.displayDerived1();    
    obj.displayDerived2();    

    return 0;
}
