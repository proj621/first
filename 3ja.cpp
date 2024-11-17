#include <iostream>
using namespace std;

class Box{
private:
    int x;
    int y;
public:
    Box(){
        x= 0;
        y= 0;
        cout<<"No-argument constructor:x= "<<x<<", y= "<<y<<endl;
    }

    Box(int a){
        x= a;
        y= 0;
        cout<<"One-argument constructor:x= "<<x<<", y= "<<y<<endl;
    }

    Box(int a, int b){
        x= a;
        y= b;
        cout<<"Two-argument constructor:x= "<<x<<", y= "<<y<<endl;
    }

    Box(Box &obj){
        x= obj.x;
        y= obj.y;
        cout<<"Copy constructor:x = "<<x<<", y= "<<y<<endl;
    }


    void display(){
        cout<<"x= "<<x<<", y= "<<y<<endl;
    }
};

int main() {
    Box obj1;
    obj1.display();

    Box obj2(10);
    obj2.display();

    Box obj3(20, 30);
    obj3.display();

    Box obj4 = obj3;
    obj4.display();

    return 0;
}