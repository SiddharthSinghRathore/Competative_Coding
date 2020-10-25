#include<stdio.h>
void main()
{
	int a[10],i=0,no=0;
	int max=0;
	printf("Enter the limit for array");
	scanf("%d",&no);
	for(i=0;i<no;i++)
	{
		scanf("%d",&a[i]);
	}
	max=a[0];
	for(i=1;i<no;i++)
	{
		if(a[i]>max)
		{
			max=a[i];
		}
	}
	printf("%d",max);
}
