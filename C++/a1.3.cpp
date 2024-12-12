//============================================================================
// Name        : a3.cpp
// Author      : pratik Jagtap
// Version     :
// Copyright   : Your copyright notice
// Description : NULL pointer
//============================================================================

#include <iostream>
using namespace std;

int main() {
     int iNo=10;
     int * ptr=NULL;

     if (ptr ==NULL)
     {
    	 cout<<"Its a NULL pointer,point it to the variable"<<endl;
    	 ptr=&iNo;
    	 cout<<"value where pointer pointing is"<<*ptr<<endl;
     }
     else
     {
        cout<<"ptr is already assigned with the address"<<endl;
     }
}
