#include<stdio.h>

void main()
{
	int shop=0,i=1,sum=0;
	int a[10];
	int candy=0,j=0;
	printf("\n Enter the no of Shop");
	scanf("%d",&shop);
	printf("Enter the Candy Price");
	scanf("%d",&candy);
	printf("\n Enter the expense for shop");
	for(i=0;i<shop;i++)
	{
		scanf("%d",&a[i]);
	}
	sum+=a[0]+a[shop-1];
	for(i=1;i<=shop;i=i+3)
	{
		for(j=i;j<i+3 && j<shop-1;j++)
		{
			if(a[j]>candy)
			{
				sum=sum+candy;
			}
			else
			{
				sum=sum+a[j];
			}
		}
/*		if(i<shop-1)
			sum=sum+a[i];
		i++;*/
	}
	printf("\n result :%d\n",sum);

}
