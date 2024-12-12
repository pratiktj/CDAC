//============================================================================
// Name        : a9.cpp
// Author      : pratik Jagtap
// Version     :
// Copyright   : --
// Description : array of structures
//============================================================================

#include <iostream>
using namespace std;

struct student
{
	char cName[50];
	int iAge;
	int iMarks;

	void Print(int iArrayLength,student sobj[])
	{
		cout<<"these are the details of students"<<endl;
	   int i=0;

	   for(i=0;i<=iArrayLength;i++)
	   {
            cout<<"student name is:"<<sobj[i].cName<<endl;
            cout<<"student age is:"<<sobj[i].iAge<<endl;
            cout<<"student marks is:"<<sobj[i].iMarks<<endl;

            cout<<endl;
	   }

	}
};

int main()
{
	 student sobj[5];

	 cout<<"please provide us an input"<<endl;
	 cin>>sobj[0].cName;
	 cin>>sobj[0].iAge;
	 cin>>sobj[0].iMarks;

	 cout<<"details of 1 student is completed"<<endl;

	 cout<<"please provide us an input for second student"<<endl;
	 cin>>sobj[1].cName;
	 cin>>sobj[1].iAge;
	 cin>>sobj[1].iMarks;

	 cout<<"details of 2 student is completed"<<endl;

	 cout<<"please provide us an input for third student"<<endl;
		 cin>>sobj[2].cName;
		 cin>>sobj[2].iAge;
		 cin>>sobj[2].iMarks;

	 cout<<"details of 3 student is completed"<<endl;

		 cout<<"please provide us an input for fourth student"<<endl;
		 cin>>sobj[3].cName;
		 cin>>sobj[3].iAge;
		 cin>>sobj[3].iMarks;

      cout<<"details of 4 student is completed"<<endl;

      cout<<"please provide us an input for fifth student"<<endl;
     		 cin>>sobj[4].cName;
     		 cin>>sobj[4].iAge;
     		 cin>>sobj[4].iMarks;

      cout<<"information of 5 students is stored"<<endl;

      sobj[0].Print(5,sobj);


	return 0;
}
