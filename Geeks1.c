#include <stdio.h>
void display(int a[],int no)
{
    int i=0,j=0;
	for(i=0;i<no;i++)
	{
	    int sum=0;
	    for(j=i-1;j>=0;j--)
	    {
	        if(a[j]>a[i])
	            sum+=a[j];
	    }
	    printf(" %d ",sum);
	}
}
int main()
{
	//code
	int arr[]={ 7, 3, 6, 2 , 1};
	int size=sizeof arr/sizeof *arr;
	printf("%d\n",size);
	display(arr,size);
	return 0;
}
