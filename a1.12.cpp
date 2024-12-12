//============================================================================
// Name        : a12.cpp
// Author      : pratik Jagtap
// Version     :
// Copyright   : --
// Description : creating multiple objects
//============================================================================

#include <iostream>

using namespace std;


class employee
{
public:
	char cName[50];
	int iId;
	int iSalary;

	employee(char cEmp[50],int id, int iSalary)
	{
		this->cName[50]=cEmp[50];
		this->iId=id;
		this->iSalary=iSalary;
	}

	void Print()
	{
       cout<<"employee name is:"<<cName<<endl;
       cout<<"employee id is:"<<iId<<endl;
       cout<<"employee salary is"<<iSalary<<endl;
	}
};
int main() {
	 employee eobj("pratik",9,9000);
	 eobj.Print();

	 employee eobj1("ganesh",18,20000);
	 eobj1.Print();

	 employee eobj2("mahesh",27,30000);
	 eobj2.Print();

	return 0;
}
