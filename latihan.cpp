#include <iostream>
#include <string>

using namespace std;

class Human
{
    private:
        string name;
        char gender;

    public:


    Human()
    {
        this->name - "";
        this->gender = '-';
    }

    Human(string name,char gender)
    {

        this->name = name;
        this->gender - gender;
    }

    string get_name()
    {
        this->name = name;
    }

    char get_gender()
    {

    void set_gender(char gender)
    {
        this->gender = gender;
    }

    void eat()
    {
        cout << this->name << " is eating!" << "\n";
    }

    void sleep()
    {
        cout << this->name << " is sleeping!" << '\n';
    }

    ~Human()
    {

    }
};