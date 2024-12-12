//============================================================================
// Name        : a7.cpp
// Author      : pratik Jagtap
// Version     :
// Copyright   : --
// Description : structure in c and c++
//============================================================================
/////////structure in c language///////
/*#include <stdio.h>

struct Person {
    char name[50];
    int age;
    float height;
};

int main() {
    // Initialize the structure
    struct Person person1 = {"Alice", 30, 5.5};

    // Print the members of the structure
    printf("Name: %s\n", person1.name);
    printf("Age: %d\n", person1.age);
    printf("Height: %.1f\n", person1.height);

    return 0;
}*/

//Structure in C++//
#include <iostream>
#include <string>
using namespace std;

struct a7 {
    string name;
    int age;
    float height;
};

int main() {
    // Initialize the structure
    a7 aobj = {"Alice", 30, 5.5};

    // Print the members of the structure
    cout << "Name: " << aobj.name << endl;
    cout << "Age: " << aobj.age << endl;
    cout << "Height: " << aobj.height << endl;

    return 0;
}


