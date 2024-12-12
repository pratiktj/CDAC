//============================================================================
// Name        : a5.cpp
// Author      : pratik Jagtap
// Version     :
// Copyright   : --
// Description : pointer ,constant pointer to variable,const.variable
//============================================================================

#include <iostream>
using namespace std;

int main() {
	  // 1. Pointer to a const value
	    const int a = 10;
	    const int *ptr1 = &a;

	    // ptr1 points to a const value, so the value it points to cannot be changed through ptr1
	    std::cout << "Value of a using ptr1: " << *ptr1 << std::endl;

	    // Uncommenting the next line will cause a compilation error
	    // *ptr1 = 20;

	    int b = 20;
	    ptr1 = &b; // However, ptr1 itself can be pointed to another address
	    std::cout << "Value of b using ptr1: " << *ptr1 << std::endl;

	    // 2. const pointer to a value
	    int c = 30;
	    int *const ptr2 = &c;

	    // ptr2 is a const pointer, so it cannot point to another address
	    std::cout << "Value of c using ptr2: " << *ptr2 << std::endl;

	    *ptr2 = 40; // But the value pointed by ptr2 can be changed
	    std::cout << "New value of c using ptr2: " << *ptr2 << std::endl;

	    // Uncommenting the next line will cause a compilation error
	    // ptr2 = &b;

	    // 3. const pointer to a const value
	    const int d = 50;
	    const int *const ptr3 = &d;

	    // ptr3 is a const pointer to a const value, so neither the value pointed by ptr3 can be changed
	    // nor can ptr3 point to another address
	    std::cout << "Value of d using ptr3: " << *ptr3 << std::endl;

	    // Uncommenting the next lines will cause compilation errors
	    // *ptr3 = 60;
	    // ptr3 = &a;

	    return 0;
	}
