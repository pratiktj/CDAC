//============================================================================
// Name        : a8.cpp
// Author      : pratik Jagtap
// Version     :
// Copyright   : --
// Description : structure initialization with methods
//============================================================================

#include <iostream>
using namespace std;

struct student
{
public:
	int iRollNo;
	char cDivision;
	int iFees;

    student()
	{
		cout<<"inside constructor"<<endl;
	}
     void display(int iR,char cDiv,int iMoney)
	{
		this->iRollNo=iR;
		this->cDivision=cDiv;
		this->iFees=iMoney;

		cout<<"Roll number is"<<iRollNo<<endl;
		cout<<"Division  is"<<cDivision<<endl;
		cout<<"Fee is"<<iFees<<endl;


	}


};

int main() {
	student sobj;
	sobj.display(9,'A',1000);
	return 0;
}
