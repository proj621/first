#include <iostream>
using namespace std;

class Student{
protected:
    int rollNumber;
public:
    void setRollNumber(int roll){
        rollNumber = roll;
    }

    void displayRollNumber(){
        cout<<"Roll Number: "<<rollNumber<<endl;
    }
};

class Marks : virtual public Student{
protected:
    int subj1, subj2, subj3;
public:
    void setMarks(int m1, int m2, int m3){
        subj1 = m1;
        subj2 = m2;
        subj3 = m3;
    }

    void displayMarks(){
        cout<<"Marks - Subject1: "<<subj1
             <<", Subject2: "<<subj2
             <<", Subject3: "<<subj3<<endl;
    }
};

class Sports : virtual public Student{
protected:
    int sportsMarks;
public:
    void setSportsMarks(int sm){
        sportsMarks = sm;
    }

    void displaySportsMarks(){
        cout<<"Sports Marks: "<<sportsMarks<<endl;
    }
};

class Result : public Marks, public Sports{
public:
    void displayTotalMarks() {
        int total = subj1 + subj2 + subj3 + sportsMarks;
        displayRollNumber();
        displayMarks();
        displaySportsMarks();
        cout<<"Total Marks: "<<total<<endl;
    }
};

int main() {
    Result student;

    student.setRollNumber(101);
    student.setMarks(85, 90, 88);    
    student.setSportsMarks(75);         

    
    student.displayTotalMarks();

    return 0;
}
