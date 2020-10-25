#include<stdio.h>
#include<stdlib.h>
void main()
{
	int a1,a2=0;
	int b1=0,b2=0;
	int c1=0,c2=0;
	int d1=0,d2=0;int e1=0,e2=0;
	int f1=0,f2=0;
	printf("\n Enter the milage for A1 Petrol");
	scanf("%d",&a1);
	printf("\n Enter the Cost for per Liter petrol");
	scanf("%d",&b1);
	printf("\n Enter the Showroom price for Petrol");
	scanf("%d",&c1);
	printf("\n Enter the AVerage monthly kilometer covered for petrol");
	scanf("%d",&d1);
	printf("\n Enter The maintaince Cost per month For Petrol");
	scanf("%d",&e1);
	printf("\n Enter the milage for A2 Diesel");
	scanf("%d",&a2);
	printf("\n Enter the Cost for per Liter Diesel");
	scanf("%d",&b2);
	printf("\n Enter the Showroom price for Diesel");
	scanf("%d",&c2);
	printf("\n Enter the Average monthly Kilometer covered for Diesel");
	scanf("%d",&d2);
	printf("\n Enter The maintaince Cost per month For Diesel");
	scanf("%d",&e2);
	//f1 for petrol
	int p1=(d1/a1)*b1*60;
	f1=c1+e1*60+p1;

	//f2 for Diesel
	int p2=(d2/a2)*b2*60;
	f2=c2+e2*60+p2;

	if(f1<f2)
	{
		printf("Petrol");
	}
	else
	{
		printf("Diesel");
	}



}
