#include<iostream>
#include<map>
using namespace std;

int main()
{
    map<string,int> mpp;
    mpp["one"] = 1;
    
    if(mpp.find("one") == mpp.end()) {
        mpp["one"] = 2;
    }

    cout << mpp["one"];

    return 0;
}