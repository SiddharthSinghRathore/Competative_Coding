#include<stdio.h>
#define max(result,count)
void main()
{
	int no=0,i=0;
	int a[10];
	int *len=NULL;
	int count=0;
	int result=0;
	printf("Entre the Number");
	scanf("%d",&no);
	while(no>0)
	{
		a[i]=no%2;
		no=no/2;
		i++;
	}
	for(i=i-1;i>=0;i--)
	{
		printf("\n%d\n",a[i]);
	}
       int size=sizeof(a)/sizeof(a[0]);
/*	
	for(i=0;i<size;i++)
	{
		if(a[i]==0)
		{
			count=0;
		}
		else
		{
			count++;
			result=max(result,count);
		}
	}
	printf("result:%d",result);*/
}
