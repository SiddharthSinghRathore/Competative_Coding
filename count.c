#include<stdio.h>
void main()
{
	int no=0;
	int count=0;
	printf("Enter the no");
	scanf("%d",&no);
	while(no!=0)
	{
		no=no/10;
		count++;
	}
	printf("%d",count);
}
