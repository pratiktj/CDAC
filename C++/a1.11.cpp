//============================================================================
// Name        : a11.cpp
// Author      : pratik Jagtap
// Version     :
// Copyright   : --
// Description : access specifiers and their role
//============================================================================

#include <iostream>
using namespace std;

class access
{
public:
	int a;

private:
	int b;

protected:
	int c;

	access(int x,int y,int z)
	{
		this->a=x;
		this->b=y;
		this->c=z;
	}

};
int main() {

	access aobj(9,10,11);

	cout<<aobj.a<<endl;
	cout<<aobj.b<<endl;
	cout<<aobj.c<<endl;

	return 0;
}
