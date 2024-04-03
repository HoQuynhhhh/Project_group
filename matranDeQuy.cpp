#include<iostream>
using namespace std;
void inMaTran(int a[][100], int n){
    if (n <= 0)        return;
   
    for (int i=0;i<n;i++) {
        for (int j=0;j<n;j++) {
            cout<<a[i][j] <<" ";
        }
        cout<<endl;
    } 
    inMaTran(a,n-n*n);
}
int main(){
	int n,a[100][100];
	cout<<"Nhap n (ma tran nxn): ";
	cin>>n;
inMaTran(a,n);
}
